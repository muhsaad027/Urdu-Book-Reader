package com.example.saadiqbal.bookapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondBookIndex extends AppCompatActivity {
    TextView t2,ghazilayt,radif1,c1,c2,c3;
    ImageView home;
    ListView IndexBook;
    String name = "SecondBookIndex";
    Bundle b = new Bundle();
    ArrayList<Item> itemsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_book_index);
        setTitle(null);
        Toolbar topToolBar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);

        itemsList = new ArrayList<>();
        IndexBook = (ListView) findViewById(R.id.navList2);

          /*---------------------------------------*/


        itemsList.add(new Item("خطوط غالب جلد 1","1",true));
        itemsList.add(new Item("مرزا ہر گوپال تفتہؔ","GKK-01-001.txt",false));
        itemsList.add(new Item("نواب علاء الدین احمد خاں علائیؔ","GKK-01-002.txt",false));
        itemsList.add(new Item("متن کے مآخذ","GKK-01-003.txt",false));
        itemsList.add(new Item("حواشی","GKK-01-004.txt",false));
        itemsList.add(new Item("خطوط غالب جلد 2","1",true));
        itemsList.add(new Item("میر مہدی مجروحؔ","GKK-02-001.txt",false));
        itemsList.add(new Item("میاں داد خاں سیاحؔ","GKK-02-002.txt",false));
        itemsList.add(new Item("چودھری عبدالغفور سرورؔ","GKK-02-003.txt",false));
        itemsList.add(new Item("حکیم غلام نجف خاں","GKK-02-005.txt",false));
        itemsList.add(new Item("خواجہ غلام غوث خاں بے خبرؔ","GKK-02-006.txt",false));
        itemsList.add(new Item("نواب حسین مرزا","GKK-02-007.txt",false));
        itemsList.add(new Item("مرزا حاتم علی مہرؔ","GKK-02-009.txt",false));
        itemsList.add(new Item("مولانا محمدنعیم الحق آزادؔ","GKK-02-0010.txt",false));
        itemsList.add(new Item("فرقانی میرٹھی","GKK-02-0011.txt",false));
        itemsList.add(new Item("مولانا عباس رفعت","GKK-02-0012.txt",false));
        itemsList.add(new Item("محمود مرزا","GKK-02-0013.txt",false));
        itemsList.add(new Item("عبدالحق","GKK-02-0014.txt",false));
        itemsList.add(new Item("حکیم محب علی","GKK-02-0015.txt",false));
        itemsList.add(new Item("مولوی ضیاء الدین خاں ضیاؔ دہلوی","GKK-02-0016.txt",false));
        itemsList.add(new Item("مہارا جا سردار سنگھ والی بیکانیر","GKK-02-0017.txt",false));
        itemsList.add(new Item("شہزادہ بشیر الدین","GKK-02-0018.txt",false));
        itemsList.add(new Item("حکیم غلام مرتضیٰ خاں","GKK-02-0019.txt",false));
        itemsList.add(new Item("مرزا باقر علی خاں کاملؔ","GKK-02-0020.txt",false));
        itemsList.add(new Item("میر احمد حسین میکشؔ","GKK-02-0021.txt",false));
        itemsList.add(new Item("میر سر فراز حسین","GKK-02-0022.txt",false));
        itemsList.add(new Item("مرزا عباس بیگ","GKK-02-0023.txt",false));
        itemsList.add(new Item("نواب یوسف مرزا","GKK-02-0024.txt",false));
        itemsList.add(new Item("مولوی احمد حسن قنوجی","GKK-02-0025.txt",false));
        itemsList.add(new Item("مرزا شمشاد علی بیگ رضوانؔ","GKK-02-0026.txt",false));
        itemsList.add(new Item("منشی کیول رام ہشیارؔ","GKK-02-0027.txt",false));
        itemsList.add(new Item("میر افضل علی میرن","GKK-02-0028.txt",false));
        itemsList.add(new Item("منشی ہیرا سنگھ","GKK-02-0029.txt",false));
        itemsList.add(new Item("پیارے لال آشوبؔ","GKK-02-0030.txt",false));
        itemsList.add(new Item("محمد زکریا خاں زکیؔ دہلوی","GKK-02-0031.txt",false));
        itemsList.add(new Item("یوست علی خاں عزیزؔ","GKK-02-0032.txt",false));
        itemsList.add(new Item("منشی غلام بسم اللہ","GKK-02-0033.txt",false));
        itemsList.add(new Item("میر بدہ علی خاں عرف مرزا میر","GKK-02-0034.txt",false));
        itemsList.add(new Item("محمد محسن (صدرالصدور)","GKK-02-0035.txt",false));
        itemsList.add(new Item("بنام نا معلوم","GKK-02-0036.txt",false));
        itemsList.add(new Item("بنام نا معلوم","GKK-02-0037.txt",false));
        itemsList.add(new Item("سید سجاد مرزا","GKK-02-0038.txt",false));
        itemsList.add(new Item("نواب مصطفیٰ خاں بہادر شیفتہؔ","GKK-02-0039.txt",false));
        itemsList.add(new Item("حکیم ظہیر الدین احمد خاں","GKK-02-0040.txt",false));
        itemsList.add(new Item("مرزا قربان علی بیگ خاں سالکؔ","GKK-02-0041.txt",false));
        itemsList.add(new Item("میر محمد زکی زکیؔ","GKK-02-0042.txt",false));
        itemsList.add(new Item("مردان علی خاں رعناؔ","GKK-02-0043.txt",false));
        itemsList.add(new Item("نواب ضیا الدین احمد خاں نیر رخشاںؔ","GKK-02-0044.txt",false));
        itemsList.add(new Item("مولانا احمد حسین میناؔ مرزا پوری","GKK-02-0045.txt",false));
        itemsList.add(new Item("شیخ لطیف احمد بلگرامی","GKK-02-0046.txt",false));
        itemsList.add(new Item("بابو ہر گوبند سہاے نشاطؔ","GKK-02-0047.txt",false));
        itemsList.add(new Item("مولی محمد عبدالرزاق شاکرؔ","GKK-02-0048.txt",false));
        itemsList.add(new Item("خطوط غالب جلد 3","1",true));
        itemsList.add(new Item("نواب انور الدولہ سعد الدین خاں بہادر شفقؔ","GKK-03-001.txt",false));
        itemsList.add(new Item("نواب میر غلام بابا خان","GKK-03-002.txt",false));
        itemsList.add(new Item("منشی محمد ابراہیم خلیل","GKK-03-003.txt",false));
        itemsList.add(new Item("نواب میر ابراہیم خاں","GKK-03-004.txt",false));
        itemsList.add(new Item("صاحب عالم مار ہروی","GKK-03-005.txt",false));
        itemsList.add(new Item("شاہ عالم","GKK-03-006.txt",false));
        itemsList.add(new Item("حکیم سید احمد حسن مودودی","GKK-03-007.txt",false));
        itemsList.add(new Item("منشی سخاوت حسین","GKK-03-008.txt",false));
        itemsList.add(new Item("منشی بہاری لال مشتاق","GKK-03-009.txt",false));
        itemsList.add(new Item("ظہیر الدین کی طرف سے اُن کے چچا کے نام","GKK-03-0010.txt",false));
        itemsList.add(new Item("سید بدر الدین احمد کاشف المعروف بہ فقیر","GKK-03-0011.txt",false));
        itemsList.add(new Item("منشی عبداللطیف","GKK-03-0012.txt",false));
        itemsList.add(new Item("منشی شیونارائن آرامؔ","GKK-03-0013.txt",false));
        itemsList.add(new Item("منشی نبی بخش حقیرؔ","GKK-03-0015.txt",false));
        itemsList.add(new Item("تفضل حسین خاں","GKK-03-0017.txt",false));
        itemsList.add(new Item("نواب سید محمد یوسف علی خاں بہادر ناظمؔ","GKK-03-0018.txt",false));
        itemsList.add(new Item("بنام نواب کلب علی خاں بہادر","GKK-03-0019.txt",false));
        itemsList.add(new Item("خطوط غالب جلد 4","1",true));
        itemsList.add(new Item(" سید غلام حسنین قدر بلگرامی","GKK-04-001.txt",false));
        itemsList.add(new Item("سید ابو محمد جلیل الدین حسین ","GKK-04-002.txt",false));
        itemsList.add(new Item("عزیز الدین","GKK-04-003.txt",false));
        itemsList.add(new Item("ولایت علی خاں ولایت و عزیز صیفی پوری","GKK-04-004.txt",false));
        itemsList.add(new Item("مفتی محمد عباس","GKK-04-005.txt",false));
        itemsList.add(new Item("مرزا امیر الدین احمد خاں المدعو بہ فرخ مرزا","GKK-04-006.txt",false));
        itemsList.add(new Item("مولوی نعمان احمد","GKK-04-007.txt",false));
        itemsList.add(new Item("بنام نامعلوم","GKK-04-008.txt",false));
        itemsList.add(new Item("مولوی عبدالغفور خاں نساخ","GKK-04-009.txt",false));
        itemsList.add(new Item("مولوی کرامت علی","GKK-04-0010.txt",false));
        itemsList.add(new Item("حکیم غلام رضا خاں","GKK-04-0011.txt",false));
        itemsList.add(new Item("قاضی محمد نور الدین حسین خاں رضوی فائق","GKK-04-0012.txt",false));
        itemsList.add(new Item("محمد حسین خاں","GKK-04-0013.txt",false));
        itemsList.add(new Item("مرزا رحیم بیگ","GKK-04-0014.txt",false));
        itemsList.add(new Item("محمد حبیب اللہ ذکا","GKK-04-0015.txt",false));
        itemsList.add(new Item("منشی سیل چند","GKK-04-0016.txt",false));
        itemsList.add(new Item("خلیفہ احمد علی احمد رام پوری","GKK-04-0017.txt",false));
        itemsList.add(new Item("سید محمد عباس علی خاں بیتاب","GKK-04-0018.txt",false));
        itemsList.add(new Item("نامعلوم","GKK-04-0019.txt",false));
        itemsList.add(new Item("مظہر علی اور عبداللہ","GKK-04-0020.txt",false));
        itemsList.add(new Item("منشی نول کشور","GKK-04-0021.txt",false));
        itemsList.add(new Item("میر ولایت علی کے نام","GKK-04-0022.txt",false));
        itemsList.add(new Item("حکیم غلام نجف خاں","GKK-04-0023.txt",false));
        itemsList.add(new Item("سید فرزند احمد صفیر بلگرامی","GKK-04-0024.txt",false));
        itemsList.add(new Item("نواب زین العابدین خاں عرف کلّن میاں","GKK-04-0025.txt",false));
        itemsList.add(new Item("محمد حسین خاں","GKK-04-0026.txt",false));
        itemsList.add(new Item("عبدالرحمن تحسین","GKK-04-0027.txt",false));
        itemsList.add(new Item("نامعلوم","GKK-04-0028.txt",false));
        itemsList.add(new Item("حکیم ظہیر الدین دہلوی","GKK-04-0029.txt",false));
        itemsList.add(new Item("متن کے مآخذ","GKK-04-0030.txt",false));
        itemsList.add(new Item("حواشی","GKK-04-0031.txt",false));
        itemsList.add(new Item("کتابیات","GKK-04-0032.txt",false));

            /*---------------------------------------*/

        MyAdapter myAdapter=new MyAdapter(this,R.layout.item_row,itemsList);
        IndexBook.setAdapter(myAdapter);
        home = (ImageView)findViewById(R.id.homescreen);
        t2  = (TextView) findViewById(R.id.textHeader);
        c1 = (TextView)findViewById(R.id.thisindexehading);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/mnw.ttf");
        b = getIntent().getExtras();
        String filename = b.getString("Book1");
        t2.setText(filename);
        t2.setTypeface(typeface);
        c1.setTypeface(typeface);
        /*c1 = (TextView) findViewById(R.id.content1);
        c2 = (TextView) findViewById(R.id.content2);
        home = (ImageView)findViewById(R.id.homescreen);
        c3 = (TextView) findViewById(R.id.content3);


        c1.setTypeface(typeface);

        c2.setTypeface(typeface);
        c3.setTypeface(typeface);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(FirstBookIndex.this,ReaderBook.class);
                startActivity(n);
            }
        });*/
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(SecondBookIndex.this,MainAppScreenHome.class);
                startActivity(n);
            }
        });

        IndexBook.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int itemPosition, long l) {

                if(itemsList.get(itemPosition).getType())
                    return;
                //Toast.makeText(FirstBookIndex.this,""+  itemsList.get(itemPosition).getFileName(),Toast.LENGTH_LONG).show();
                Intent i = new Intent(SecondBookIndex.this,ReaderBook.class);
                i.putExtra("file",""+itemsList.get(itemPosition).getFileName());
                i.putExtra("class",""+name);
                i.putExtra("headings",""+itemsList.get(itemPosition).getIndex());
                i.putExtra("bookname","Ghalib k Khatoot");
                startActivity(i);
            }
        });
       /* ghazilayt= (TextView) findViewById(R.id.ghazliyat_section);
        ghazilayt.setTypeface(typeface);
        radif1 = (TextView) findViewById(R.id.rdeefAlif);
        radif1.setTypeface(typeface);*/
      /*  IndexBook = (ListView)findViewById(R.id.navList1);*/

/*
        mDrawerList = (ListView)findViewById(R.id.navList1);
        addDrawerItems();
    }

    private void addDrawerItems()
    {
        String[] a = {"اس کتاب کے بارے میں","غالبؔ کی ردیف","حروفِ تہجی","اُردو حروف تہجی","حروف تہجی کا چارٹ","کلمات ِ تشکر"};
        mAdapter =  new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,a);
        mDrawerList.setAdapter(mAdapter);

    }*/
    }
}