package order.Do;

import java.text.SimpleDateFormat;
import java.util.Date;

public class  Train {

    private String id;

    private String name;

    private Date startTime;

    private Date endTime;

    private Node arr;

    private int seaNum;

    public Train(String id, String name, Date startTime, Date endTime, Node arr, int seaNum) {
        this.id = id;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.arr = arr;
        this.seaNum = seaNum;
    }

    public Train() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Node getArr() {
        return arr;
    }

    public void setArr(Node arr) {
        this.arr = arr;
    }

    public int getSeaNum() {
        return seaNum;
    }

    public void setSeaNum(int seaNum) {
        this.seaNum = seaNum;
    }

    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss ");
    @Override
    public String toString() {
        return "Train{" +
                "id='" + id + '\'' +
                ", 列车名称='" + name + '\'' +
                ", 发车时间=" + format.format(startTime) + "\n" +
                ", 到站时间=" + format.format(endTime) +
                ", 站点信息:" + showNode(arr) +
                ", 座位数=" + seaNum +
                '}';
    }
    public String showNode(Node node){
        String list = "";
        System.out.println(node.getName());
        for(int i=0;i<6;i++){
            list = list + "站点:"+node.getName()+"\n"+" 到达时间:"+"2023-04-22 4:00:00 ";
            node = node.getNext();
        }
        return list;
    }
}
