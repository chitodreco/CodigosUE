import Contador from "./contador/contador";
import Formulario from "./formulario/formulario";

export default function Home() {
  return (
    <div>
      <h1>Elemento principal</h1>
      <p>Este componente será el principal</p>
      <div className="row">
        <div className="col">
          <Contador />
        </div>
        <div className="col">
          <Formulario />
        </div>
      </div>
    </div>
  );
}
