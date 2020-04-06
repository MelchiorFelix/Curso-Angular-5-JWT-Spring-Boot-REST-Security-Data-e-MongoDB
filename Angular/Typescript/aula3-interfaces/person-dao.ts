import { DaoInterface } from "./dao.interfece";
import { Person } from "../Aula2-classes/person";

export class PersonDao implements DaoInterface{

    tableName: string;

    insert(person: Person): boolean{
        console.log('inserting...', person.toString());
        return true;
    }

    update(person: Person): boolean{
        return true;
    }

    delete(id: number): boolean{
        return true;
    }

    find(id: number): Person{
        return null;
    }

    findAll(): [Person]{
        return[new Person('Mike')];
    }
}