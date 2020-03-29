
import { Person } from "../Aula2-classes/person";
import { DaoInterface } from "./dao.interfece";
import { Dao } from "./dao";

let dao: Dao<Person> = new Dao<Person>();
let person: Person = new Person('Mike');

dao.insert(person);