package com.corso.java.branimusicali;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {

    private SessionFactory sessionFactory;

    public static void main(String arg[]) throws Exception {
        Test test = new Test();
        test.setUp();
        test.testBasicUsage();
        test.shutDown();
    }

    protected void setUp() throws Exception {
        sessionFactory = new Configuration()
                .configure() // configura la SessionFactory utilizzando l' hibernate.cfg.xml
                .buildSessionFactory();
    }

    protected void shutDown() throws Exception {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }

    public void testBasicUsage() {
        Session session;
        Transaction transaction;

        session = sessionFactory.openSession();
        transaction = session.beginTransaction();

        // Creating the artists
        Artist artist1 = new Artist("Michael Jackson");
        Artist artist2 = new Artist("James Brown");
        Artist artist3 = new Artist("Led Zeppelin");

        session.save(artist1);
        session.save(artist2);
        session.save(artist3);

        // Creating the genres
        Genre genre1 = new Genre("POP");
        Genre genre2 = new Genre("JAZZ");
        Genre genre3 = new Genre("BLUES");
        Genre genre4 = new Genre("ROCK");
        Genre genre5 = new Genre("METAL");
        Genre genre6 = new Genre("BOSSA NOVA");

        session.save(genre1);
        session.save(genre2);
        session.save(genre3);
        session.save(genre4);
        session.save(genre5);
        session.save(genre6);

        // Creating the cds
        CD cd1 = new CD("CDPOP001");
        CD cd2 = new CD("CDBLUES001");

        // Creating songs
        Song song1 = new Song("Beat It", artist1.getId());
        Song song2 = new Song("Feeling good", artist2.getId());
        Song song3 = new Song("Immigrant Song", artist3.getId());

        session.save(song1);
        session.save(song2);
        session.save(song3);


        song1.setCd(cd1);
        song2.setCd(cd2);
        song3.setCd(cd2);

        session.save(cd1);
        session.save(cd2);

        Archive a1 = new Archive();
        a1.setArchiveName("Pop Music");
        session.save(a1);

        Archive a2 = new Archive();
        a2.setArchiveName("Blues Music");
        session.save(a2);

        cd1.setArchive(a1);
        cd2.setArchive(a2);

        artist1.setArchive(a1);
        artist2.setArchive(a2);
        artist3.setArchive(a2);



        transaction.commit();

    }
}
