package com.example.hw_4_bulavkin_maxim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements onClick{

    private RecyclerView filmsRV;
    private ArrayList<Model> list ;
onClick onClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        filmsRV = findViewById(R.id.recycler_view_film);
        loadData();
        FilmAdapter adapter =new FilmAdapter(list, this::onClick );
        filmsRV.setAdapter(adapter);

    }
private void loadData(){
        list = new ArrayList<>();
        list.add(new Model(R.drawable.img,"Побег из Шоушенка","Побег из Шоушенка - американский художественный драматический фильм 1994 года, " +
                "снятый режиссёром Фрэнком Дарабонтом по его же сценарию, и рассказывающий историю Энди Дюфрейна, " +
                "незаслуженно приговорённого к пожизненному заключению и пробывшего в заключении почти 20 лет.","9"));
        list.add(new Model(R.drawable.img_2,"Бойцовский клуб","Прослеживая шаги Тайлера, " +
                "Рассказчик обнаруживает бойцовские клубы во всех крупных городах страны — более того, " +
                "их члены принимают его за Тайлера. Звонок по телефону Марле подтверждает догадку Рассказчика о том, " +
                "что Тайлер — это он сам, точнее, та сторона личности, которую он старается не афишировать (альтер эго). ","8.6 ★"));
        list.add(new Model(R.drawable.img_3,"Зелёная миля","Пол Эджкомб — начальник блока смертников в тюрьме «Холодная гора», каждый из узников которого однажды проходит " +
                "«зеленую милю» по пути к месту казни. Пол повидал много заключённых и надзирателей за время работы. " +
                "Однако гигант Джон Коффи, обвинённый в страшном преступлении, стал одним из самых необычных обитателей блока. ","9.2 ★"));
        list.add(new Model(R.drawable.img_4,"Список Шиндлера","Лента рассказывает реальную историю загадочного Оскара Шиндлера, " +
                "члена нацистской партии, преуспевающего фабриканта, спасшего во время Второй мировой войны более тысячи ста евреев. " +
                "Это триумф одного человека, не похожего на других, и драма тех, кто, благодаря ему, выжил в ужасный период человеческой истории.","9.1 ★"));
        list.add(new Model(R.drawable.img_5,"Форест Гамп","Повествование ведётся от лица главного героя Форреста Гампа - человека с благородным и открытым сердцем, " +
                "однако с ограниченными умственными способностями, который рассказывает историю своей необычной жизни.","9 ★"));

}

    @Override
    public void onClick(Model model) {
        Intent intent = new Intent(this, MainActivity2.class);

        intent.putExtra("key",model.getDescription());

//        intent.putExtra("key1", model.getImage());
//        intent.putExtra("key2", model.getDescription());
//        intent.putExtra("key3", model.getReyting());
//        intent.putExtra("key4", model.getTitle());
        startActivity(intent);
    }
}