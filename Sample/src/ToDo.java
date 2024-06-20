import java.util.UUID;

public class ToDo {

    //8桁または12桁の数字からなる文字列と一致する正規表現

    private static final String DEADLINE_PATTERN = "[0-9]{8}|[0-9]{12}";

   //フィールド

    private final String id;
   private String subject;
   private String deadline;
   private String priority;
   private String state;   

    //コンストラクタ

    public ToDo(String subject, String deadline, String priority, String id, String state) {

     // 日付の文字列が規定した文字パターンと合致していなければ例外を発生させる

      if(!deadline.matches(DEADLINE_PATTERN)) {

            throw new IllegalArgumentException();

        }

        this.subject = subject;

        this.deadline = deadline;

        this.priority = priority;

        this.id = id;

        this.state = state;

    }

    

    public ToDo(String subject, String deadline, String priority) {

        if(!deadline.matches(DEADLINE_PATTERN)) {

           throw new IllegalArgumentException();

       }

       this.subject = subject;

       this.deadline = deadline;

       this.priority = priority;

       this.id = UUID.randomUUID().toString();

       this.state = 

"NOT_YET_STARTED"  ;

    }

    

    public ToDo(ToDo todo) {

       if(!deadline.matches(DEADLINE_PATTERN)) {

           throw new IllegalArgumentException();

       }

       this.subject = todo.subject;

       this.deadline = todo.deadline;

       this.priority = todo.priority;

       this.id = todo.id;

       this.state = 

todo.state;

    }

    

    //getterメソッド

    public String getSubject() {return subject;}

    public String getDeadline() {return deadline;}

    public String getPriority() {return priority;}

    public String getState() {return state;}

    

    //setterメソッド

    public void setState(String state) {

        this.state = state;

    }



   //オーバーライド

    public boolean equals(Object o) {

        //oがToDoクラスである、かつ
       //oのフィールドidの値が自身のフィールドidと同じであれば等価とする

        if(o instanceof ToDo && ((ToDo) o).id.equals(id)) {

            return true;

        }else {

            return false;

        }

    }

    

    public String toString() {

        return String.format("主題: %s, 期限: %s, 優先度: %s, 状態: %s",

                                subject, deadline, priority, state);

    }

}