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

public class ThirdBookIndex extends AppCompatActivity {
    TextView t2,ghazilayt,radif1,c1,c2,c3;
    ImageView home;
    Bundle b = new Bundle();
    ListView IndexBook;
    ArrayList<Item> itemsList;
    String name = "ThirdBookIndex";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_book_index);
        setTitle(null);
        Toolbar topToolBar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);

        itemsList = new ArrayList<>();
        IndexBook = (ListView) findViewById(R.id.navList2);

        /*---------------------------------------*/

        itemsList.add(new Item("عرضِ مرتبـ از فاروق ارگلی","WG-001.txt",false));
        itemsList.add(new Item("غالبـ — ایکـ نظر میں","WG-002.txt",false));
        itemsList.add(new Item("اسد اللہ خاں از نوابـ مصطفی خاں شیفتہؔ","WG-003.txt",false));
        itemsList.add(new Item("دیباچہ اُردوئے معلی از میر مہدی مجروحؔ","WG-004.txt",false));
        itemsList.add(new Item("تقریظ دیوانِ ریختہ از سرسید احمد خاں","WG-005.txt",false));
        itemsList.add(new Item("اسدؔ  از مولوی کریم الدین","WG-006.txt",false));
        itemsList.add(new Item("نجم الدولہ دبیر الملک از مولانا محمد حسین آزاد","WG-007.txt",false));
        itemsList.add(new Item("غالب علیہ الرحمۃ از صفیر بلگرامی","WG-008.txt",false));
        itemsList.add(new Item("مرزا اسد اللہ خاں از مرزا قادر بخش","WG-009.txt",false));
        itemsList.add(new Item("غالبؔ  از منشی امیر احمد مینائی","WG-0010.txt",false));
        itemsList.add(new Item("غالبؔ مرزا اسد اللہ خاں دہلوی از سید محمد صدیق حسن خاں","WG-0011.txt",false));
        itemsList.add(new Item("غالبؔ  از سید نورالحسن خاں","WG-0012.txt",false));
        itemsList.add(new Item("ختم الشعراء مرزا نوشہ از مرزا حیرتؔ دہلوی","WG-0013.txt",false));
        itemsList.add(new Item("غالبؔ  از صلاح الدین خدا بخش","WG-0014.txt",false));
        itemsList.add(new Item("غالبؔ کی خانگی زندگی از حمید احمد خان","WG-0015.txt",false));
        itemsList.add(new Item("غالبؔ کی کہانی غالبؔ کی زبانی از محمد عتیق","WG-0016.txt",false));
        itemsList.add(new Item("احوالِ غالبؔ کی گمشدہ کڑیاں از مولانا غلام رسول مہر","WG-0017.txt",false));
        itemsList.add(new Item("مرزا کے کلام پر ریویو از مولانا الطاف حسین حالیؔ","WG-0018.txt",false));
        itemsList.add(new Item("محاسنِ کلامِ غالبؔ  از ڈاکٹر عبدالرحمن بجنوری","WG-0019.txt",false));
        itemsList.add(new Item("غالبؔ کے تغزل کا سماجی پہلو از ڈاکٹر عبادت بریلوی","WG-0020.txt",false));
        itemsList.add(new Item("غالبؔ کی اپنے کلام پر اصلاحیں از امتیاز علی عرشی","WG-0021.txt",false));
        itemsList.add(new Item("غالبؔ اور آزردہؔ از خواجہ احمد فاروقی","WG-0022.txt",false));
        itemsList.add(new Item("غالبؔ کا ایک شعر از مالکـ رام","WG-0023.txt",false));
        itemsList.add(new Item("غالبؔ اور اُردو خطوط نویسی از برج موہن دتا تریہ کیفی","WG-0024.txt",false));
        itemsList.add(new Item("مطالعہ خطوطِ غالبؔ  از سہیل احمد","WG-0025.txt",false));
        itemsList.add(new Item("1857ء کا ہنگامہ اور خطوطِ غالبؔ  از ڈاکٹر تنویر احمد علوی","WG-0026.txt",false));
        itemsList.add(new Item("غالبؔ اور برہان از امتیاز علی عرشی","WG-0027.txt",false));
        itemsList.add(new Item("غالبؔ کے چند اہم نقاد از پروفیسر محمد حسن","WG-0028.txt",false));
        itemsList.add(new Item("غالبؔ کی ایک نادر فیصلہ کن تحریر از منظور الحسن برکاتی","WG-0029.txt",false));
        itemsList.add(new Item("غالبؔ کا فن اور اس کا نفسیاتی پس منظر از ڈاکٹر اختر اورنیوی","WG-0030.txt",false));
        itemsList.add(new Item("غالبؔ  از پروفیسر آل احمد سرورؔ","WG-0031.txt",false));
        itemsList.add(new Item("تفہیم غالبؔ اکیسویں صدی میں از ڈاکٹر وحید قریشی","WG-0032.txt",false));
        itemsList.add(new Item("غالبؔ  از سید امداد امام اثرؔ","WG-0033.txt",false));
        itemsList.add(new Item("مرزا غالبؔ کی شاعرانہ عظمت از پیارے لال شاکر میرٹھی","WG-0034.txt",false));
        itemsList.add(new Item("غالبؔ کا فلسفہ از مولانا عبدالماجد دریابادی","WG-0035.txt",false));
        itemsList.add(new Item("غالبؔ اور عصری معنویت از ڈاکٹر سلیم اختر","WG-0036.txt",false));
        itemsList.add(new Item("غالبـؔ اور فلسفۂ وجودیت از ڈاکٹر نعیم احمد","WG-0037.txt",false));
        itemsList.add(new Item("غالبـؔ اور جدید ذہن از ڈاکٹر وزیر آغا","WG-0038.txt",false));
        itemsList.add(new Item("غالبؔ کا شعور — ایک مطالعہ از راجندر ناتھ شیداؔ","WG-0039.txt",false));
        itemsList.add(new Item("غالبؔ کے چند قلمزدہ اشعار از وجاہت علی سندیلوی","WG-0040.txt",false));
        itemsList.add(new Item("مرزا غالبؔ ایک صوفی کی حیثیت سے از میکشؔ اکبرآبادی","WG-0041.txt",false));
        itemsList.add(new Item("مرزا غالبؔ کا فارسی کلام از مرزا جعفر حسین","WG-0042.txt",false));
        itemsList.add(new Item("مرزا غالبؔ کے چند شعر از مولانا غلام رسول مہر","WG-0043.txt",false));
        itemsList.add(new Item("تعلیاتِ غالبؔ  از خواجہ عبدالحمید یزدانی","WG-0044.txt",false));
        itemsList.add(new Item("غالبؔ کا سفرِ کلکتہ از لطیف الزماں خاں","WG-0045.txt",false));
        itemsList.add(new Item("جاپانی اور پاک و ہند کی علاقائی زبان از ڈاکٹر سید معین الرحمن","WG-0046.txt",false));
        itemsList.add(new Item("مطالعۂ غالبؔ —خطوط کی روشنی میں از حسرت کاسگنجوی","WG-0047.txt",false));
        itemsList.add(new Item("غالبؔ کے خطوط صفیر بلگرامی کے نام از قاضی عبدالودود","WG-0048.txt",false));
        itemsList.add(new Item("غالبؔ کا اندازِ گل افشانیِ گفتار از احمد ندیم قاسمی","WG-0049.txt",false));
        itemsList.add(new Item("عودِ ہندی کے بارے میں ۔۔۔۔۔ از ڈاکٹر خلیق انجم","WG-0050.txt",false));
        itemsList.add(new Item("آزادیٔ اظہار کا مسئلہ اور مرزا غالبؔ از پروفیسر صادق","WG-0051.txt",false));
        itemsList.add(new Item("مرزا کے بعض اشعار کے مطالب از جعفر علی خاں اثر لکھنوی","WG-0052.txt",false));
        itemsList.add(new Item("غالبؔ اور عارفؔ از شاہد صدیقی","WG-0053.txt",false));
        itemsList.add(new Item("گل رعنا نسخۂ سویدا از سید قدرت نقوی","WG-0054.txt",false));
        itemsList.add(new Item("رثائے غالبؔ میں انیسؔ کی رباعی از محمد صادق صفوی","WG-0055.txt",false));
        itemsList.add(new Item("غالبؔ کے اُردو دیوان کی اشاعتیں از عطا کاکوی","WG-0056.txt",false));
        itemsList.add(new Item("مرزا غالبؔ کی چند تصویریں از مختار الدین احمد آرزوؔ","WG-0057.txt",false));
        itemsList.add(new Item("غالبؔ کا اثر ہمارے ادب اور ادیبوں پر از ڈاکٹر فرمان فتح پوری","WG-0058.txt",false));
        itemsList.add(new Item("1857ء اور مرزا غالبؔ  از ڈاکٹر محمد عقیل","WG-0059.txt",false));
        itemsList.add(new Item("غالبؔ کے لطیفے از شاہد صدیقی","WG-0060.txt",false));
        itemsList.add(new Item("انتخاب اشعارِ غالبؔ  از سرسید احمد خاں","WG-0061.txt",false));
        itemsList.add(new Item("انتخاب اشعارِ غالبؔ  از علامہ اقبالؔ","WG-0062.txt",false));


               /*---------------------------------------*/

        MyAdapter myAdapter=new MyAdapter(this,R.layout.item_row,itemsList);
        IndexBook.setAdapter(myAdapter);
        c1 = (TextView)findViewById(R.id.thisindexehading);
        home = (ImageView)findViewById(R.id.homescreen);
        t2  = (TextView) findViewById(R.id.textHeader);
        b = getIntent().getExtras();
        String filename = b.getString("Book1");
        t2.setText(filename);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/mnw.ttf");
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
                Intent n = new Intent(ThirdBookIndex.this,MainAppScreenHome.class);
                startActivity(n);
            }
        });

        IndexBook.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int itemPosition, long l) {

                if(itemsList.get(itemPosition).getType())
                    return;
                //Toast.makeText(FirstBookIndex.this,""+  itemsList.get(itemPosition).getFileName(),Toast.LENGTH_LONG).show();
                Intent i = new Intent(ThirdBookIndex.this,ReaderBook.class);
                i.putExtra("file",""+itemsList.get(itemPosition).getFileName());
                i.putExtra("class",""+name);
                i.putExtra("headings",""+itemsList.get(itemPosition).getIndex());
                i.putExtra("bookname","Wardat-e-Ghalib");
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