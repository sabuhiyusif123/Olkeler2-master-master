package project.sabuhi.com.olkeler;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by Cavid on 5/1/2016.
 */
public class OlkeLab {

    private ArrayList<Olke> mOlkeler;

    private static OlkeLab sOlkeLab;
    private Context mAppContext;
    private OlkeLab(Context appContext) {
        mAppContext = appContext;
        mOlkeler = new ArrayList<Olke>();


            Olke af = new Olke();

            Olke al = new Olke();
            Olke alg = new Olke();
            Olke amsm = new Olke();
            Olke an = new Olke();
            Olke ang = new Olke();
            Olke ant = new Olke();
            Olke arg = new Olke();
            Olke arm = new Olke();
            Olke ar = new Olke();
            Olke aua = new Olke();
            Olke au= new Olke();
            Olke az = new Olke();
            Olke bah = new Olke();
            Olke bahr = new Olke();
            Olke ban = new Olke();
            Olke bar = new Olke();
            Olke bel = new Olke();
            Olke belg = new Olke();
            Olke beli= new Olke();
            Olke ben = new Olke();
            Olke ber = new Olke();
            Olke bhu = new Olke();
            Olke bol = new Olke();
            Olke bos = new Olke();
            Olke bot = new Olke();
            Olke bra = new Olke();
            Olke bru = new Olke();
            Olke bul = new Olke();
            Olke bur = new Olke();
            Olke buru = new Olke();


            af.setNameOlke("Afganistan " );

            al.setNameOlke("Albania" );
            alg.setNameOlke("ALgeria " );
            amsm.setNameOlke("American Samona" );
            an.setNameOlke("Andorra " );
            ang.setNameOlke("Angola " );
            ant.setNameOlke("Antigua Barbuda" );
            arg.setNameOlke("Argentina" );
            arm.setNameOlke("Armenia" );
            ar.setNameOlke("Aruba" );
            aua.setNameOlke("Australia" );
            au.setNameOlke("Austria" );
            az.setNameOlke("Azerbaycan" );
            bah.setNameOlke("Bahamas");
            bahr.setNameOlke("Bahrain");
            ban.setNameOlke("Bangladesh");
            bar.setNameOlke("Barbados");
            bel.setNameOlke("Belarus");
            belg.setNameOlke("Belgium");
            beli.setNameOlke("Belize");
            ben.setNameOlke("Benin");
            ber.setNameOlke("Bermuda");
            bhu.setNameOlke("Bhutan");
            bol.setNameOlke("Bolivia");
            bos.setNameOlke("Bosnia and Herzegovina");
            bot.setNameOlke("Botswana");
            bra.setNameOlke("Brazil");
            bru.setNameOlke("Brunei Darussalam");
            bul.setNameOlke("Bulgaria");
            bur.setNameOlke("Burkina Faso");
            buru.setNameOlke("Burundi");

            mOlkeler.add(af);

            mOlkeler.add(az);
            mOlkeler.add(al);
            mOlkeler.add(alg);
            mOlkeler.add(amsm);
            mOlkeler.add(an);
            mOlkeler.add(ang);
            mOlkeler.add(ant);
            mOlkeler.add(arg);
            mOlkeler.add(arm);
            mOlkeler.add(ar);
            mOlkeler.add(aua);
            mOlkeler.add(au);
            mOlkeler.add(bah);
            mOlkeler.add(bahr);
            mOlkeler.add(ban);
            mOlkeler.add(bar);
            mOlkeler.add(bel);
            mOlkeler.add(belg);
            mOlkeler.add(beli);
            mOlkeler.add(ben);
            mOlkeler.add(ber);
            mOlkeler.add(bhu);
            mOlkeler.add(bol);
            mOlkeler.add(bos);
            mOlkeler.add(bot);
            mOlkeler.add(bra);
            mOlkeler.add(bru);
            mOlkeler.add(bul);
            mOlkeler.add(bur);
            mOlkeler.add(buru);


    }
    public static OlkeLab get(Context c) {
        if (sOlkeLab == null) {
            sOlkeLab = new OlkeLab(c.getApplicationContext());
        }

           return sOlkeLab;
    }
    public ArrayList<Olke> getOlkeler(){
        return mOlkeler;
    }

    public Olke getOlke(UUID id){
        for(Olke o :  mOlkeler){
            if(o.getId().equals(id))
                return o;
        }
        return null;
    }
}
