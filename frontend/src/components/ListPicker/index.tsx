import axios from "axios";
import { useEffect, useState } from "react";
import { modulos } from "types/modulos";
import { BASE_URL } from "utils/request";

type listPickerData = {
    modId: number[];
    modNome: string[];
}
const ListPicker = () => {
    const [lpData, setLpData] = useState<listPickerData>({ modId: [], modNome: [] });
    useEffect(() => {
        axios.get(`${BASE_URL}/modulos`)
            .then(response => {
                const data = response.data as modulos[];
                const mId = data.map(x => x.id);
                const mNome = data.map(x => x.nome);
                setLpData({ modId: mId, modNome: mNome });
            });
    }, []);
    return (
        <select className="form-select form-select-sm" aria-label=".form-select-sm example">
            <option selected>Escolha o módulo em questão</option>
            {
                lpData.modNome?.map(modulo => (
                    <option value={modulo}>{modulo}</option>
                ))
            }
        </select>
    );
}

export default ListPicker;