/*
Cada operación representa una acción real:
PURCHASE -> put (compra o ingreso de componentes)
QUERY -> get (consulta de disponibilidad)
LEND -> get + actualización (préstamo a estudiante)
RECEIVE -> get + actualización (devolución de componente)
DISPOSE -> delete (baja por daño, pérdida u obsolescencia)
*/
public enum OperationType {
    PURCHASE,
    QUERY,
    LEND,
    RECEIVE,
    DISPOSE
}