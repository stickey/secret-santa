package stocke

import io.reactiverse.reactivex.pgclient.PgPool
import io.reactiverse.reactivex.pgclient.PgRowSet
import io.reactiverse.reactivex.pgclient.Tuple
import io.reactivex.Single
import io.reactivex.functions.Consumer

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DAO {

    @Inject
    PgPool client

    void insertPlayer() {

        Single<PgRowSet> result = client.rxPreparedQuery('INSERT INTO player (id) VALUES ($1)', Tuple.of(new Long(1)))

        result.subscribe(new Consumer<PgRowSet>() {
            @Override
            void accept(PgRowSet rows) throws Exception {
                println "accepted..."
            }
        },
        new Consumer<Throwable>() {
            @Override
            void accept(Throwable throwable) throws Exception {
                throwable.printStackTrace()
            }
        })
    }
}
