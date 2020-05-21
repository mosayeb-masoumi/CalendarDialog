# CalendarDialog

 add jitpack to build.gradle(Project)

    buildscript {
    repositories {
        google()
        jcenter()
        maven { url 'https://jitpack.io' }
      }
    }

    allprojects {
    repositories {
        google()
        jcenter()
        maven { url 'https://jitpack.io' }
     }
    }
    
needed minSdk:

     minSdkVersion 18

libray:

    implementation 'com.github.mosayeb-masoumi:CalendarDialog:1.1.0'
   
    
# implimentation in java

how to create simple dialog:
   
    DialogFactory dialogFactory = new DialogFactory(context);
        dialogFactory.createCalendarDialog(new DialogFactory.DialogFactoryInteraction() {
            @Override
            public void onAcceptButtonClicked(String... params) {

                String date = params[0];
                txt_date.setText(date);

            }

            @Override
            public void onDeniedButtonClicked(boolean bool) {

            }
         // layout_root is the id that we set in our layout.xml
        }, layout_root);
            
            
          
 
 
how to create customized dialog:
    
    private void openCalendar() {

        CalendarDialog calendarDialog = new CalendarDialog.Builder()

                .setMax_year(2025)
                .setMin_year(2015)

                .setTitle("calendar")
                .setTitleTextColor(getResources().getColor(R.color.white))
                .setTitleTextSize(20)

                .setCloseIconVisibility(true)
                .setCloseIconBackgroundDrawable(getResources().getDrawable(R.drawable.ic_close))

                .setHeaderBackgroundColor(getResources().getColor(R.color.colorAccent))
                .setHeaderBackgroundDrawable(getResources().getDrawable(R.drawable.dialog_header_shape))

                .setDateBackgroundColor(getResources().getColor(R.color.yellow))
                .setDateBackgroundDrawable(getResources().getDrawable(R.drawable.date_background))

                .setButtonRegisterBackgroundColor(getResources().getColor(R.color.colorAccent))
                .setButtonRegisterBackgroundDrawable(getResources().getDrawable(R.drawable.dialog_btn_shape))
                .setButtonRegisterTextColor(getResources().getColor(R.color.blue_dark))
                .setButtonRegisterTextSize(20)

                .setButtonSetTodayBackgroundColor(getResources().getColor(R.color.colorAccent))
                .setButtonSetTodayBackgroundDrawable(getResources().getDrawable(R.drawable.dialog_btn_shape))
                .setButtonSetTodayTextColor(getResources().getColor(R.color.blue_dark))
                .setButtonSetTodayTextSize(20)

                .setDialogBackgroundColor(getResources().getColor(R.color.colorAccent))
                .setDialogBackgroundDrawable(getResources().getDrawable(R.drawable.dialog_btn_shape))

                .build();


        DialogFactory dialogFactory = new DialogFactory(context);
        dialogFactory.createCalendarDialog(new DialogFactory.DialogFactoryInteraction() {
            @Override
            public void onAcceptButtonClicked(String... params) {

                String date = params[0];
                txt_date.setText(date);

            }

            @Override
            public void onDeniedButtonClicked(boolean bool) {

            }

        }, layout_root,calendarDialog);
    }
    
    
    
    
  # implimentation in kotlin   
  
  
    class SecondActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val builder = CalendarDialog.Builder()
                .setMax_year(2025)
                .setMin_year(2015)
                .build()

        openCalendar(builder)
    }

    private fun openCalendar(builder: CalendarDialog) {

        val dialogFactory = DialogFactory(this)
        dialogFactory.createCalendarDialog(object : DialogFactory.DialogFactoryInteraction {
            override fun onAcceptButtonClicked(vararg strings: String?) {

            }

            override fun onDeniedButtonClicked(cancel_dialog: Boolean) {

            }

        }, root_second, builder)
      }
     }

    
    
    
 customized CalendarDialog dialog image:
 
![customized](https://user-images.githubusercontent.com/40134233/82564242-afc77580-9b8d-11ea-9c73-e749fb66a955.png)
    
 simple CalendarDialog image:
 
 ![simple](https://user-images.githubusercontent.com/40134233/82564321-d4235200-9b8d-11ea-94b6-2682fb16505f.png)
 
 
