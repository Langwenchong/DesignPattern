package homework03.demo10;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 16:27
 * @Version 1.0
 */
public abstract class ClassificationTemplate {
    public final void Classification() {
        readDate();
        TransfromData();
        ClassifyData();
        ShowDate();
    }

    protected void ShowDate() {
        System.out.println("显示数据分类结果");
    }

    protected abstract void ClassifyData();

    protected void TransfromData() {
        System.out.println("转换分类的数据格式");
    }

    protected void readDate() {
        System.out.println("读取要分类的数据");
    }


}
