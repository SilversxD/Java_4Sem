package practice_15.services;

import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import practice_15.modules.Manufacture;
import practice_15.modules.Worker;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@Service
@RequiredArgsConstructor
public class WorkerService {
    private final SessionFactory sessionFactory;
    private Session session;

    @PostConstruct
    void init() {
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        /*Worker worker1 = new Worker();
        worker1.setFirstName("Vasily");
        worker1.setLastName("Pupkin");
        worker1.setMiddleName("Mihaylovich");
        session.saveOrUpdate(worker1);

        Worker worker2 = new Worker();
        worker2.setFirstName("Petr");
        worker2.setLastName("Anikin");
        worker2.setMiddleName("Valeryevich");
        session.saveOrUpdate(worker2);

        Worker worker3 = new Worker();
        worker3.setFirstName("Ivan");
        worker3.setLastName("Ivanov");
        worker3.setMiddleName("HelloWorldovich");
        session.saveOrUpdate(worker3);

        Worker worker4 = new Worker();
        worker4.setFirstName("Maria");
        worker4.setLastName("Gromova");
        worker4.setMiddleName("Alexandrovna");
        session.saveOrUpdate(worker4);*/

        transaction.commit();

    }
    public Manufacture getManufactureByUser(Long manufactureId){
        return session.createQuery("from Worker where id = :id", Worker.class).setParameter("id", manufactureId).
                getSingleResult().getManufacture();
    }
    public List<Worker> getWorkers() {
        return session.createQuery("select g from Worker g", Worker.class).getResultList();
    }
}
