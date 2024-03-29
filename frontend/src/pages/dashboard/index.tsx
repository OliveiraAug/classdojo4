import Footer from "components/Footer";
import ListPicker from "components/ListPicker";
import NavBar from "components/NavBar";
const Dashboard = () => {
    return (
        <>
            <NavBar />
            <div className="container">
                <h1 className="text-primary">Relatório Mensal</h1>
            </div>
            <div className="container">
                <ListPicker/>
                <br></br>
            </div>
            <Footer />
        </>
    );
}

export default Dashboard;