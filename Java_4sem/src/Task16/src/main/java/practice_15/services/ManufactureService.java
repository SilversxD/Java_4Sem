package practice_15.services;

import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import practice_15.modules.Manufacture;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@Service
@RequiredArgsConstructor
public class ManufactureService {
    private final SessionFactory sessionFactory;
    private Session session;

    @PostConstruct
    void init() {
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        /*Manufacture manufacture1 = new Manufacture();
        manufacture1.setName("MK-213-55");
        manufacture1.setAddress("50.17694926 84.2625756242");
        session.saveOrUpdate(manufacture1);

        Manufacture manufacture2 = new Manufacture();
        manufacture2.setName("LH-535-12");
        manufacture2.setAddress("41.89691201 13.8978373436");
        session.saveOrUpdate(manufacture2);*/


        transaction.commit();

    }
    public List<Manufacture> getManufactures() {
        return session.createQuery("select g from Manufacture g", Manufacture.class).getResultList();
    }
}
