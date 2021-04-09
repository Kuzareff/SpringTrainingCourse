package org.example;

import org.springframework.stereotype.Component;

import java.util.List;

@Component //Для создания бинов при помощи аннотаций, необходимо указывать в классе данную аннотацию.
//Так Spring понимает какой бин ему создать. Можно также указать id бина, но если оо не указан,
//то бин будет создан по названию класса и первая буква будет в нижнем регистре. (rapMusic)
public class RapMusic implements Music{
    @Override
    public List<String> getSong() {
        return getSong();
    }
}
