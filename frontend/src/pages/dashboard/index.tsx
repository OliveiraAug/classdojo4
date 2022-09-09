import Footer from "components/Footer";
import ListPicker from "components/ListPicker";
import NavBar from "components/NavBar";

const Dashboard = () => {
    return (
        <>
            <NavBar />
            <body className="padding:0 margin:0 height:100%">

                <div className="container">
                    <h1 className="text-primary">Relatório Mensal</h1>
                </div>
                <div className="container">
                    <ListPicker />
                </div>


            </body>
            <Footer />
        </>
    );
}

export default Dashboard;