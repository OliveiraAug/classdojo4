import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { Link } from "react-router-dom";

const Home = () => {
    return (
        <>
            <NavBar />
            <body className="padding:0 margin:0 height:100%">
                <div className="container">
                    <div className="jumbotron">
                        <h1 className="display-4 text-primary">Classdojo4</h1>
                        <p className="lead">Relatório mensal das atividades curriculares de alunos da Codebuddy Itajaí</p>
                        <hr />
                        <p>Esta aplicação consiste em exibir um relatório para ser enviado aos pais através da ferramenta Classdojo.</p>
                        <Link className="btn btn-primary btn-lg" to="/dashboard">
                            Acessar o Dashboard
                        </Link>
                    </div>
                </div>
            </body>
            <Footer />
        </>

    );
}

export default Home;