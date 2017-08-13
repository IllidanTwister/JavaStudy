package object;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LongJuanFeng {
    private String work;
    private Boolean isWorkCompleted;
    private Long dickLength;

    public LongJuanFeng(String work, Boolean isWorkCompleted, Long dickLength) {
        this.work = work;
        this.isWorkCompleted = isWorkCompleted;
        this.dickLength = dickLength;
    }

    @Override
    public String toString() {
        return String.format("work : %s, isWorkCompleted : %s, dickLength : %s", work, isWorkCompleted.toString(), dickLength.toString());
    }
}
