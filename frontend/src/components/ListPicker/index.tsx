import axios from "axios";
import { modulos } from "types/modulos";
import { BASE_URL } from "utils/request";

type listPickerData = {
    modId: number[];
    modNome: string[];
}

const ListPicker = () => {
    let lpData: listPickerData = { modId: [], modNome: [] };

    axios.get(`${BASE_URL}/modulos`)
        .then(response => {
            const data = response.data as modulos[];
            const mId = data.map(x => x.id);
            const mNome = data.map(x => x.nome);
            lpData = { modId: mId, modNome: mNome };
            
            console.log(lpData);
        });


    return (
        <select className="form-select form-select-sm" aria-label=".form-select-sm example">
            <option selected>Escolha o módulo em questão</option>
            <option value="1">Lógica 1</option>
            <option value="2">Lógica 2</option>
            <option value="3">Apps 1</option>
            <option value="4">Apps 2</option>
            <option value="5">Maker 1</option>
            <option value="6">Maker 2</option>
            <option value="7">Games 1</option>
            <option value="8">Games 2 - Construct</option>
            <option value="9">Games 2 - Game maker</option>
            <option value="10">Games 3</option>
            <option value="11">Web</option>
            <option value="12">Drones</option>
        </select>
    );
}

export default ListPicker;