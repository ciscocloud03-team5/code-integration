package sample.lawn;

import javafx.animation.*;
import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableBooleanValue;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;
import sample.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.Character;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.concurrent.Callable;

public class lawnController3 implements Initializable
{
    private Game game;
    private ImageView plant_0;

    @FXML
    private ImageView pea_tile;
    private String pea_tile_loc;

    @FXML
    private ImageView sun_tile;
    private String sun_tile_loc;

    @FXML
    private ImageView walnut_tile;
    private String walnut_tile_loc;

    @FXML
    private ImageView mine_tile;
    private String mine_tile_loc;

    @FXML
    private Label sunTokenText;

    @FXML
    private ImageView loadingScreen;


    ArrayList<ObservableBooleanValue> arrayVals = new ArrayList<ObservableBooleanValue>();


    private ImageView tile_list[] = new ImageView[]{pea_tile, sun_tile, walnut_tile, mine_tile};

    private volatile int tile_click_count = 0;

    private ImageView temp_ImageView;
    private Image temp_Image;

    TranslateTransition sunTokenTrans;

    @FXML
    private ImageView lawn_mower_5;

    @FXML
    private ImageView lawn_mower_4;

    @FXML
    private ImageView lawn_mower_3;

    @FXML
    private ImageView lawn_mower_2;

    @FXML
    private ImageView lawn_mower_1;


    @FXML
    private Pane lawn_pane;

    @FXML
    private ImageView zombie_0;
    @FXML
    private ImageView zombie_1;
    @FXML
    private ImageView zombie_3;

    @FXML
    private ImageView football_zombie_0;

    @FXML
    private ImageView sun_token_0;


    @FXML
    private StackPane stackpane_pause;

    @FXML
    private AnchorPane lawn_pane_00;
    @FXML
    private AnchorPane lawn_pane_01;
    @FXML
    private AnchorPane lawn_pane_02;
    @FXML
    private AnchorPane lawn_pane_03;
    @FXML
    private AnchorPane lawn_pane_04;
    @FXML
    private AnchorPane lawn_pane_05;
    @FXML
    private AnchorPane lawn_pane_06;
    @FXML
    private AnchorPane lawn_pane_07;
    @FXML
    private AnchorPane lawn_pane_08;


    @FXML
    private AnchorPane lawn_pane_10;
    @FXML
    private AnchorPane lawn_pane_11;
    @FXML
    private AnchorPane lawn_pane_12;
    @FXML
    private AnchorPane lawn_pane_13;
    @FXML
    private AnchorPane lawn_pane_14;
    @FXML
    private AnchorPane lawn_pane_15;
    @FXML
    private AnchorPane lawn_pane_16;
    @FXML
    private AnchorPane lawn_pane_17;
    @FXML
    private AnchorPane lawn_pane_18;

    @FXML
    private AnchorPane lawn_pane_20;
    @FXML
    private AnchorPane lawn_pane_21;
    @FXML
    private AnchorPane lawn_pane_22;
    @FXML
    private AnchorPane lawn_pane_23;
    @FXML
    private AnchorPane lawn_pane_24;
    @FXML
    private AnchorPane lawn_pane_25;
    @FXML
    private AnchorPane lawn_pane_26;
    @FXML
    private AnchorPane lawn_pane_27;
    @FXML
    private AnchorPane lawn_pane_28;


    @FXML
    private AnchorPane lawn_pane_30;
    @FXML
    private AnchorPane lawn_pane_31;
    @FXML
    private AnchorPane lawn_pane_32;
    @FXML
    private AnchorPane lawn_pane_33;
    @FXML
    private AnchorPane lawn_pane_34;
    @FXML
    private AnchorPane lawn_pane_35;
    @FXML
    private AnchorPane lawn_pane_36;
    @FXML
    private AnchorPane lawn_pane_37;
    @FXML
    private AnchorPane lawn_pane_38;

    @FXML
    private AnchorPane lawn_pane_40;
    @FXML
    private AnchorPane lawn_pane_41;
    @FXML
    private AnchorPane lawn_pane_42;
    @FXML
    private AnchorPane lawn_pane_43;
    @FXML
    private AnchorPane lawn_pane_44;
    @FXML
    private AnchorPane lawn_pane_45;
    @FXML
    private AnchorPane lawn_pane_46;
    @FXML
    private AnchorPane lawn_pane_47;
    @FXML
    private AnchorPane lawn_pane_48;

    @FXML
    private ImageView resume_gam;

    @FXML
    private ImageView save_game;

    @FXML
    private ImageView exit_to_menu;

    @FXML
    private ImageView play;

    @FXML
    private ImageView pause;

    @FXML
    private ImageView gameEndWall;


    //Make general later
    private int currLvl = 3;

    private ArrayList<Zombie> zombieWave1 = new ArrayList<Zombie>();
    private ArrayList<Zombie> zombieWave2 = new ArrayList<Zombie>();
    private ArrayList<Zombie> zombieWave3 = new ArrayList<Zombie>();
    private ArrayList<Zombie> zombiesPaused = new ArrayList<Zombie>();



    private ArrayList<Pea> peas = new ArrayList<>();
    TranslateTransition move_lawn_mower_1;
    TranslateTransition move_lawn_mower_2;
    TranslateTransition move_lawn_mower_3;
    TranslateTransition move_lawn_mower_4;
    TranslateTransition move_lawn_mower_5 = null;
    TranslateTransition sunTokenTranslate;
    ArrayList<ImageView> sun_lists = new ArrayList<ImageView>();

    TranslateTransition move_zombie_0 = null;
    TranslateTransition move_zombie_1 = null;
    TranslateTransition move_zombie_3 = null;
    TranslateTransition move_football_zombie_0 = null;

    TranslateTransition move_sun_token_0 = null;
    Timeline timeline;

    TranslateTransition move_pea_1_0;

    private int sunCounter = 100;
    private TranslateTransition sunTranslate;

    MediaPlayer mediaPlayer3=null;
    SequentialTransition move_sun_token_1;

    private Plant[][] plants_matrix = new Plant[][]{
            {null,null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null,null}
    };

    private ArrayList<Plant> plantList = new ArrayList<Plant>();
    private ArrayList<Lawnmower> lawnmowerList = new ArrayList<Lawnmower>();

    private String selected_plant=null;

    double orgSceneX, orgSceneY;
    double orgTranslateX, orgTranslateY;



    public void play_music3()
    {
        String loc = "battle.mp3";
        Media media = new Media(new File(loc).toURI().toString());
        mediaPlayer3 = new MediaPlayer(media);
        mediaPlayer3.setAutoPlay(true);
        mediaPlayer3.setCycleCount(MediaPlayer.INDEFINITE);
    }
    public void game_pause()
    {
        stackpane_pause.setVisible(true);
//        move_lawn_mower_5.pause();
//        move_zombie_0.pause();
//        move_zombie_1.pause();
//        move_zombie_3.pause();
//        move_football_zombie_0.pause();
//        move_sun_token_0.pause();
//        move_pea_1_0.pause();
        mediaPlayer3.pause();


    }

    public void game_play()
    {
        stackpane_pause.setVisible(false);
        move_lawn_mower_5.play();
        move_zombie_0.play();
        move_zombie_1.play();
        move_zombie_3.play();
        move_football_zombie_0.play();
        move_sun_token_0.play();
        move_pea_1_0.play();
        mediaPlayer3.play();
    }

    public void return_to_main_menu() throws Exception
    {
        Pane pane = FXMLLoader.load(getClass().getResource("../main.fxml"));
        lawn_pane.getChildren().setAll(pane);
        mediaPlayer3.stop();
    }


    public void change_image_on_hover(String loc, ImageView i)
    {
        Image popup = new Image(loc);
        i.setImage(popup);
    }



    private void set_on_click_list(ImageView imageView)
    {
        imageView.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent mouseEvent)
            {
                tile_click_count=1;
                System.out.println("set_on_click was called");
                temp_ImageView = new ImageView();
                String s = ((ImageView)(mouseEvent.getSource())).getId();
//                System.out.println(s);

                if(s.equals(pea_tile_loc))
                {
//                    temp_Image = new Image("pea_shooter.gif",true);
                    try {
                        temp_Image = new Image(new FileInputStream(
                                "src/resources_not/pea_shooter.gif"));
                        selected_plant = "Shooter";
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
//                    System.out.println(temp_Image.getUrl());
//                    System.out.println("clicked pea shooter");
                }

                if(s.equals(sun_tile_loc))
                {
//                    System.out.println(3);
//                    System.out.println("clicked sun");
                    try {
                        temp_Image = new Image(new FileInputStream(
                                "src/resources_not/sun_flower.gif"));
                        selected_plant = "Producer";
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                if (s.equals(walnut_tile_loc))
                {
//                    System.out.println(3);
//                    System.out.println("clicked walnut");
                    try {
                        temp_Image = new Image(new FileInputStream(
                                "src/resources_not/walnut_full_life.gif"));
                        selected_plant = "Barrier";
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }

                if (s.equals(mine_tile_loc))
                {

//                    System.out.println(3);
//                    System.out.println("clicked mine");
                    try {
                        temp_Image = new Image(new FileInputStream(
                                "src/resources_not/cherry-bomb.gif"));
                        selected_plant = "Bomb";
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                temp_ImageView.setImage(temp_Image);
                tile_click_count=1;
            }
        });
    }



    public void moveLawnmower(ImageView imageView)
    {
        move_lawn_mower_5 = new TranslateTransition(Duration.seconds(2),imageView);
        move_lawn_mower_5.setToX(800);
        move_lawn_mower_5.setCycleCount(1);
        move_lawn_mower_5.play();

    }



    private void tile_mouse_click_listeners()
    {
//        for (int i=0; i<tile_list.length; i++)
//        {
//            set_on_click_list(tile_list[i]);
//        }
        pea_tile_loc = "pea_tile";
        sun_tile_loc = "sun_tile";
        walnut_tile_loc = "walnut_tile";
        mine_tile_loc = "mine_tile";

        temp_Image=null;


        set_on_click_list(pea_tile);
        set_on_click_list(sun_tile);
        set_on_click_list(walnut_tile);
        set_on_click_list(mine_tile);
    }
    private void  set_on_click_list_anchor_pane(AnchorPane anchorPane)
    {
        anchorPane.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("Clicked Pane");
                if(tile_click_count==1 && anchorPane.getChildren().isEmpty())
                {
                    System.out.println("clicked pane inside if");
                    //System.out.println(temp_Image.getUrl());

//                    System.out.println(anchorPane.getChildren().isEmpty() == true);

                    ImageView a = new ImageView(temp_Image);
                    lawn_pane.getChildren().add(a);

//                    plant.setImage(temp_Image);
                    ImageView plant = (ImageView) (Node)lawn_pane.getChildren().get(lawn_pane.getChildren().size()-1);
                    plant.setX(anchorPane.getLayoutX());
                    plant.setY(anchorPane.getLayoutY());
                    plant.setVisible(true);
                    plant.setFitHeight(55);
                    plant.setFitWidth(55);

//                    plant.fitHeightProperty().bind(anchorPane.heightProperty());
//                    plant.fitWidthProperty().bind(anchorPane.widthProperty());
                    String anchorpane_id = anchorPane.getId();
                    int len = anchorpane_id.length();
                    int i = Character.getNumericValue(anchorpane_id.charAt(len-2));
                    int b = Character.getNumericValue(anchorpane_id.charAt(len-1));

                    if (selected_plant == "Shooter")
                    {
                        ImageView pea_imageview = new ImageView("resources_not/Pea.png");
                        lawn_pane.getChildren().add(pea_imageview);
                        ImageView aaa = (ImageView) lawn_pane.getChildren().get(lawn_pane.getChildren().size()-1);
                        aaa.setX(anchorPane.getLayoutX()+15);
                        aaa.setY(anchorPane.getLayoutY()+8);
                        aaa.setVisible(true);
                        Pea pea = new Pea(aaa, pea_imageview);
                        peas.add(pea);
                        sunCounter = sunCounter - 100;
                        sunTokenText.setText(String.valueOf(sunCounter));

                        Shooter s = new Shooter(0,0, plant, pea);
                        pea.peaAnimation(aaa);
                        plantList.add(s);
                        plants_matrix[i][b] = s;

                        for(Pea peaTemp:peas){
                            for(Zombie zombie:zombieWave1){
                                checkCollZombPea(zombie, peaTemp);
                            }
                            for(Zombie zombie:zombieWave2){
                                checkCollZombPea(zombie, peaTemp);
                            }
                            for(Zombie zombie:zombieWave3){
                                checkCollZombPea(zombie, peaTemp);
                            }
                        }

                        for(Zombie zombie:zombieWave1){
                            checkCollPlantZomb(s, zombie);
                        }
                        for(Zombie zombie:zombieWave2){
                            checkCollPlantZomb(s, zombie);
                        }
                        for(Zombie zombie:zombieWave3){
                            checkCollPlantZomb(s, zombie);
                        }


                    }
                    else if (selected_plant == "Producer")
                    {
                        Producer s = new Producer(0,0, plant);
                        plantList.add(s);
                        plants_matrix[i][b] = s;
                        sunCounter = sunCounter - 50;
                        sunTokenText.setText(String.valueOf(sunCounter));
                        sun_gen_token(s);
                        for(Zombie zombie:zombieWave1){
                            checkCollPlantZomb(s, zombie);
                        }
                        for(Zombie zombie:zombieWave2){
                            checkCollPlantZomb(s, zombie);
                        }
                        for(Zombie zombie:zombieWave3){
                            checkCollPlantZomb(s, zombie);
                        }

                    }
                    else if (selected_plant == "Barrier")
                    {
                        Barrier s = new Barrier(0,0, plant);
                        plantList.add(s);
                        plants_matrix[i][b] = s;
                        sunCounter = sunCounter - 50;
                        sunTokenText.setText(String.valueOf(sunCounter));
                        for(Zombie zombie:zombieWave1){
                            checkCollPlantZomb(s, zombie);
                        }
                        for(Zombie zombie:zombieWave2){
                            checkCollPlantZomb(s, zombie);
                        }
                        for(Zombie zombie:zombieWave3){
                            checkCollPlantZomb(s, zombie);
                        }
                    }
                    //if (selected_plant == "Bomb")
                    else
                    {
                        Bomb s = new Bomb(0,0, plant);
                        plantList.add(s);
                        plants_matrix[i][b] = s;
                        sunCounter = sunCounter - 150;
                        sunTokenText.setText(String.valueOf(sunCounter));
                        for(Zombie zombie:zombieWave1){
                            checkCollBombZomb(s, zombie);
                        }
                        for(Zombie zombie:zombieWave2){
                            checkCollBombZomb(s, zombie);
                        }
                        for(Zombie zombie:zombieWave3){
                            checkCollBombZomb( s, zombie);
                        }
                    }


                    check_if_tile_allowed(sunCounter);

                    tile_click_count=0;

                    if (selected_plant == "Shooter") {
                        new Thread() {
                            public void run() {
                                Platform.runLater(new Runnable() {
                                    public void run() {
                                        if (selected_plant == "Shooter") {
                                            pea_tile.setDisable(true);
                                            pea_tile.setOpacity(0.5);
                                        }
                                    }
                                });
                                try {
                                    Thread.sleep(5000); //5 seconds, obviously replace with your chosen time
                                } catch (InterruptedException ex) {
                                }
                                Platform.runLater(new Runnable() {
                                    public void run() {
                                        pea_tile.setDisable(false);
                                        pea_tile.setOpacity(1);

                                    }
                                });
                            }
                        }.start();
                    }

                    if(selected_plant == "Barrier") {
                        new Thread() {
                            public void run() {
                                Platform.runLater(new Runnable() {
                                    public void run() {
                                        if (selected_plant == "Barrier") {
                                            walnut_tile.setDisable(true);
                                            walnut_tile.setOpacity(0.5);
                                        }

                                    }
                                });
                                try {
                                    Thread.sleep(5000); //5 seconds, obviously replace with your chosen time
                                } catch (InterruptedException ex) {
                                }
                                Platform.runLater(new Runnable() {
                                    public void run() {
                                        walnut_tile.setDisable(false);
                                        walnut_tile.setOpacity(1);
                                    }
                                });
                            }
                        }.start();
                    }

                    if(selected_plant == "Producer") {
                        new Thread() {
                            public void run() {
                                Platform.runLater(new Runnable() {
                                    public void run() {
                                        if (selected_plant == "Producer") {
                                            sun_tile.setDisable(true);
                                            sun_tile.setOpacity(0.5);
                                        }
                                    }
                                });
                                try {
                                    Thread.sleep(5000); //5 seconds, obviously replace with your chosen time
                                } catch (InterruptedException ex) {
                                }
                                Platform.runLater(new Runnable() {
                                    public void run() {
                                        sun_tile.setDisable(false);
                                        sun_tile.setOpacity(1);
                                    }
                                });
                            }
                        }.start();
                    }

                    if(selected_plant == "Bomb") {
                        new Thread() {
                            public void run() {
                                Platform.runLater(new Runnable() {
                                    public void run() {
                                        if (selected_plant == "Bomb") {
                                            mine_tile.setDisable(true);
                                            mine_tile.setOpacity(0.5);
                                        }
                                    }
                                });
                                try {
                                    Thread.sleep(5000); //5 seconds, obviously replace with your chosen time
                                } catch (InterruptedException ex) {
                                }
                                Platform.runLater(new Runnable() {
                                    public void run() {
                                        mine_tile.setDisable(false);
                                        mine_tile.setOpacity(1);
                                    }
                                });
                            }
                        }.start();
                    }

                }
            }
        });
    }
    @FXML
    private ImageView gameover_image;

    private void show_gameover()
    {
        gameover_image.setDisable(false);
        gameover_image.setVisible(true);
        gameover_image.toFront();
        gameover_image.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("game over won");
                try {
                        Pane pane = FXMLLoader.load(getClass().getResource("../level_select/level_select.fxml"));
                        lawn_pane.getChildren().setAll(pane);
                        mediaPlayer3.stop();
                    }
                    catch (Exception e){
                        System.out.println("Error occurred while changing levels");
                        e.printStackTrace();
                }
            }
        });
    }


    private void anchor_pane_click_listeners()
    {
        set_on_click_list_anchor_pane(lawn_pane_00);
        set_on_click_list_anchor_pane(lawn_pane_01);
        set_on_click_list_anchor_pane(lawn_pane_02);
        set_on_click_list_anchor_pane(lawn_pane_03);
        set_on_click_list_anchor_pane(lawn_pane_04);
        set_on_click_list_anchor_pane(lawn_pane_05);
        set_on_click_list_anchor_pane(lawn_pane_06);
        set_on_click_list_anchor_pane(lawn_pane_07);
        set_on_click_list_anchor_pane(lawn_pane_08);

        set_on_click_list_anchor_pane(lawn_pane_10);
        set_on_click_list_anchor_pane(lawn_pane_11);
        set_on_click_list_anchor_pane(lawn_pane_12);
        set_on_click_list_anchor_pane(lawn_pane_13);
        set_on_click_list_anchor_pane(lawn_pane_14);
        set_on_click_list_anchor_pane(lawn_pane_15);
        set_on_click_list_anchor_pane(lawn_pane_16);
        set_on_click_list_anchor_pane(lawn_pane_17);
        set_on_click_list_anchor_pane(lawn_pane_18);

        set_on_click_list_anchor_pane(lawn_pane_20);
        set_on_click_list_anchor_pane(lawn_pane_21);
        set_on_click_list_anchor_pane(lawn_pane_22);
        set_on_click_list_anchor_pane(lawn_pane_23);
        set_on_click_list_anchor_pane(lawn_pane_24);
        set_on_click_list_anchor_pane(lawn_pane_25);
        set_on_click_list_anchor_pane(lawn_pane_26);
        set_on_click_list_anchor_pane(lawn_pane_27);
        set_on_click_list_anchor_pane(lawn_pane_28);

        set_on_click_list_anchor_pane(lawn_pane_30);
        set_on_click_list_anchor_pane(lawn_pane_31);
        set_on_click_list_anchor_pane(lawn_pane_32);
        set_on_click_list_anchor_pane(lawn_pane_33);
        set_on_click_list_anchor_pane(lawn_pane_34);
        set_on_click_list_anchor_pane(lawn_pane_35);
        set_on_click_list_anchor_pane(lawn_pane_36);
        set_on_click_list_anchor_pane(lawn_pane_37);
        set_on_click_list_anchor_pane(lawn_pane_38);

        set_on_click_list_anchor_pane(lawn_pane_40);
        set_on_click_list_anchor_pane(lawn_pane_41);
        set_on_click_list_anchor_pane(lawn_pane_42);
        set_on_click_list_anchor_pane(lawn_pane_43);
        set_on_click_list_anchor_pane(lawn_pane_44);
        set_on_click_list_anchor_pane(lawn_pane_45);
        set_on_click_list_anchor_pane(lawn_pane_46);
        set_on_click_list_anchor_pane(lawn_pane_47);
        set_on_click_list_anchor_pane(lawn_pane_48);


    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
//        stuff1();
//        stuff2();
//        stuff3();
//        stuff4();
//        stuff5();
//        stuff6();
//        stuff7();
//        play_music3();

        //checkColl();
        //show_gameover();
        tile_mouse_click_listeners();
        anchor_pane_click_listeners();
        //Create Game
       // game = new Game(this, currLvl);

        //Create Zombies
        createZombies();


       // System.out.println(zombieWave1.size());
        play_music3();
        Lawnmower lawnmower1 = new Lawnmower(lawn_mower_1);
        Lawnmower lawnmower2 = new Lawnmower(lawn_mower_2);
        Lawnmower lawnmower3 = new Lawnmower(lawn_mower_3);
        Lawnmower lawnmower4 = new Lawnmower(lawn_mower_4);
        Lawnmower lawnmower5 = new Lawnmower(lawn_mower_5);
        lawnmowerList.add(lawnmower1);
        lawnmowerList.add(lawnmower2);
        lawnmowerList.add(lawnmower3);
        lawnmowerList.add(lawnmower4);
        lawnmowerList.add(lawnmower5);

        check_if_tile_allowed(sunCounter);
        pause();

        //peaAnimation();
        //zombAnimation();
        //sun_tokens_falling();

        releaseZombieWave1();
        System.out.println(arrayVals);
        sun_tokes_falling();
        sun_token_0.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("Sun clicked");
                game.produceSunTokens();
                move_sun_token_1.stop();
                move_sun_token_0.stop();
                sun_token_0.setVisible(false);
                sun_token_0.setVisible(true);
                move_sun_token_1.playFromStart();

            }
        });

        for(Zombie zombie:zombieWave1){
            checkGameEnd(gameEndWall, zombie);
            for(Lawnmower lawnmower:lawnmowerList){
                checkCollZombLawn(zombie, lawnmower);
            }
        }

        for(Zombie zombie:zombieWave2){
            checkGameEnd(gameEndWall, zombie);
            for(Lawnmower lawnmower:lawnmowerList){
                checkCollZombLawn(zombie, lawnmower);
            }
        }

        for(Zombie zombie:zombieWave3){
            checkGameEnd(gameEndWall, zombie);
            for(Lawnmower lawnmower:lawnmowerList){
                checkCollZombLawn(zombie, lawnmower);
            }
        }





    }



    public void checkCollZombLawn(Zombie zombie, Lawnmower lawnmower){
        ImageView imageView1 = zombie.getZombie();
        ImageView imageView2 = lawnmower.getImageView();

        ObservableBooleanValue colliding = Bindings.createBooleanBinding(new Callable<Boolean>() {

            @Override
            public Boolean call() throws Exception {
                return imageView1.getBoundsInParent().intersects(imageView2.getBoundsInParent());
            }

        }, imageView1.boundsInParentProperty(), imageView2.boundsInParentProperty());
        arrayVals.add(colliding);

        colliding.addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> obs,
                                Boolean oldValue, Boolean newValue) {
                if (newValue) {
                    try {
                        zombie.getZombTrans().stop();
                    }
                    catch(NullPointerException e){
                        System.out.println("Zombie animation/Zombie not found");
                    }
                    imageView1.setVisible(false);
                    moveLawnmower(imageView2);
                    lawn_pane.getChildren().remove(zombie.getZombie());
                    if(zombieWave1.contains(zombie)){
                        zombieWave1.remove(zombie);
                        if(zombieWave1.size()<=0){
                            releaseZombieWave2();
                            loadingScreen.setImage(new Image("resources_not/loadingscreen22.png"));
                        }
                        // zombie = null;
                    }
                    else if(zombieWave2.contains(zombie)){
                        zombieWave2.remove(zombie);
                        if(zombieWave2.size()<=0){
                            releaseZombieWave3();
                            loadingScreen.setImage(new Image("resources_not/loadingscreen33.png"));
                        }
                        //zombie = null;
                    }
                    else if(zombieWave3.contains(zombie)){
                        zombieWave3.remove(zombie);
                        if(zombieWave3.size()<=0) {
                            System.out.println("Level Won");
//                            try {
//                                Pane pane = FXMLLoader.load(getClass().getResource("sample/level_select/level_select.fxml"));
//                                lawn_pane.getChildren().setAll(pane);
//                            }
//                            catch (Exception e){
//                                System.out.println("Error occurred while changing levels");
//                            }
                            show_gameover();

                        }

                    }


                    //zombieAttacked(zombie, 100);
                    System.out.println("Colliding");

                }
                else {
                    System.out.println("Not colliding");
                }
            }
        });

    }

    public void checkCollPlantZomb(Plant plant, Zombie zombie){
        ImageView imageView1 = plant.getImageView();
        ImageView imageView2 = zombie.getZombie();

        ObservableBooleanValue colliding = Bindings.createBooleanBinding(new Callable<Boolean>() {

            @Override
            public Boolean call() throws Exception {
                return imageView1.getBoundsInParent().intersects(imageView2.getBoundsInParent());
            }

        }, imageView1.boundsInParentProperty(), imageView2.boundsInParentProperty());
        arrayVals.add(colliding);


        colliding.addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> obs,
                                Boolean oldValue, Boolean newValue) {
                if (newValue) {
                    //imageView1.setVisible(false);
                    //moveLawnmower(imageView2);
                    zombie.getZombTrans().pause();
                    timeLineAdd(plant, zombie, 20);



                } else {
                    System.out.println("Not colliding plant");
                }
            }
        });

    }

    public void checkCollBombZomb(Bomb bomb, Zombie zombie){
        ImageView imageView1 = bomb.getImageView();
        ImageView imageView2 = zombie.getZombie();

        ObservableBooleanValue colliding = Bindings.createBooleanBinding(new Callable<Boolean>() {

            @Override
            public Boolean call() throws Exception {
                return imageView1.getBoundsInParent().intersects(imageView2.getBoundsInParent());
            }

        }, imageView1.boundsInParentProperty(), imageView2.boundsInParentProperty());
        arrayVals.add(colliding);


        colliding.addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> obs,
                                Boolean oldValue, Boolean newValue) {
                if (newValue) {
                    bomb.reduceHP(51);
                    removePlant(bomb);
                    lawn_pane.getChildren().remove(bomb.getImageView());
                    bomb.getImageView().setY(1000);
                    zombieAttacked(zombie, 200);



                } else {
                    System.out.println("Not colliding plant");
                }
            }
        });

    }



    public void checkCollZombPea(Zombie zombie, Pea pea){
        ImageView imageView1 = zombie.getZombie();
        ImageView imageView2 = pea.getImageView();
        if(imageView1!=null) {
            ObservableBooleanValue colliding = Bindings.createBooleanBinding(new Callable<Boolean>() {

                @Override
                public Boolean call() throws Exception {
                    return imageView1.getBoundsInParent().intersects(imageView2.getBoundsInParent());
                }

            }, imageView1.boundsInParentProperty(), imageView2.boundsInParentProperty());

            arrayVals.add(colliding);

            colliding.addListener(new ChangeListener<Boolean>() {
                @Override
                public void changed(ObservableValue<? extends Boolean> obs,
                                    Boolean oldValue, Boolean newValue) {
                    if (newValue) {
                        pea.getTranslateTransition().stop();
                        imageView2.setVisible(false);
                        zombieAttacked(zombie, 51);
                        pea.getTranslateTransition().play();

                        // System.out.println("Pea Colliding");

                    } else {
                        imageView2.setVisible(true);
                    }
                }
            });
        }

    }

    public void checkGameEnd(ImageView imageView1, Zombie zombie){
        ImageView imageView2 = zombie.getZombie();

        if(imageView1!=null) {
            ObservableBooleanValue colliding = Bindings.createBooleanBinding(new Callable<Boolean>() {

                @Override
                public Boolean call() throws Exception {
                    return imageView1.getBoundsInParent().intersects(imageView2.getBoundsInParent());
                }

            }, imageView1.boundsInParentProperty(), imageView2.boundsInParentProperty());

            arrayVals.add(colliding);

            colliding.addListener(new ChangeListener<Boolean>() {
                @Override
                public void changed(ObservableValue<? extends Boolean> obs,
                                    Boolean oldValue, Boolean newValue) {
                    if (newValue) {
                        try {
                            throw new LevelQuitException();
                        }
                        catch (LevelQuitException e){
                            System.out.println("Lost Game");
                        }

                        // System.out.println("Pea Colliding");

                    }
                    else {

                    }
                }
            });
        }

    }

    public synchronized void zombieAttacked(Zombie zombie, int damage){
        try{
//            if(zombie.getHP()>0) {
//                zombie.reduceHP(damage);
//            }
            System.out.println(zombie.getHP());
            if(zombie.getHP()>0) {
                zombie.reduceHP(damage);
            }
        }

        catch (ZombieDeadException e){
           //zombie.getZombie().setVisible(false);

            zombie.getZombTrans().stop();
            zombie.getZombie().setY(-1000);
            lawn_pane.getChildren().remove(zombie.getZombie());

            //lawn_pane.getChildren().remove(zombie.getZombie2());


            // zombie.setZombie(null);
            if(zombieWave1.contains(zombie)){
                zombieWave1.remove(zombie);
                if(zombieWave1.size()<=0){
                    releaseZombieWave2();
                    loadingScreen.setImage(new Image("resources_not/loadingscreen22.png"));
                }
               // zombie = null;
            }
            else if(zombieWave2.contains(zombie)){
                zombieWave2.remove(zombie);
                if(zombieWave2.size()<=0){
                    releaseZombieWave3();
                    loadingScreen.setImage(new Image("resources_not/loadingscreen33.png"));
                }
                //zombie = null;
            }
            else if(zombieWave3.contains(zombie)){
                zombieWave3.remove(zombie);
                if(zombieWave3.size()<=0) {
                    System.out.println("Level Won");
                    show_gameover();

                }
               // zombie = null;
//                try {
//                    throw new LevelWinException();
//                }
//                catch(LevelWinException l){
//                    System.out.println(e.getMessage());
//                }
            }
            //zombie.setZombie(null);
           // zombie = null;
        }
    }

    public void releaseZombieWave1(){

        for(Zombie zombie:zombieWave1){
            zombie.setTranslateTransition();
            zombie.moveZombie();
        }
    }

    public void releaseZombieWave2(){

        for(Zombie zombie:zombieWave2){
            zombie.setTranslateTransition();
            zombie.moveZombie();
        }
    }

    public void releaseZombieWave3(){

        for(Zombie zombie:zombieWave3){
            zombie.setTranslateTransition();
            zombie.moveZombie();
        }
    }

    public Pane getLawn_pane(){
        return lawn_pane;
    }

    public void createZombies() {

        //Change number and type according to Zombies

        if(currLvl==1){

        }

        else if(currLvl==2){

        }

        else if(currLvl==3){
            for(int x= 0; x<4;x++){
                //Define normal zombie properties in code
                Zombie zombie = new Zombie(120);
                zombieWave1.add(zombie);
                set_Zombie(zombie);
            }
            for(int x= 0; x<4;x++){
                //Define normal zombie properties in code
                Zombie zombie = new Zombie(120);
                zombieWave2.add(zombie);
                set_Zombie(zombie);
            }
            for(int x= 0; x<5;x++){
                //Define normal zombie properties in code
                Zombie zombie = new Zombie(120);
                zombieWave3.add(zombie);
                set_Zombie(zombie);
            }
        }
        else if(currLvl==4){

        }
        else if(currLvl==5){

        }
    }


    public void set_Zombie(Zombie zombie)
    {
        Random rand = new Random();

        ArrayList<Integer> YPositions = new ArrayList<Integer>();
        YPositions.add(66);
        YPositions.add(141);
        YPositions.add(214);
        YPositions.add(290);
        YPositions.add(360);

        int r = rand.nextInt(5);
//
        lawn_pane.getChildren().add(zombie.getZombie());
        ImageView aa = (ImageView) lawn_pane.getChildren().get(lawn_pane.getChildren().size()-1);

        aa.setX(850 + (r*8));
        aa.setY(YPositions.get(rand.nextInt(YPositions.size())));
        aa.setPreserveRatio(true);
        aa.setFitHeight(65);
        aa.setVisible(true);

    }

    public void timeLineAdd(Plant plant, Zombie zombie, int damage){
        System.out.println(plant.getHP());
        timeline = new Timeline(new KeyFrame(
                Duration.millis(1000),
                ae -> takeDamage(plant, zombie, 20)));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();

    }

    public void sun_gen_token(Producer plant)
    {
        ImageView flower = plant.getImageView();
        Image ii=null;
        try {
            ii = new Image(new FileInputStream(
                    "src/resources_not/sun.gif"));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ImageView sun = new ImageView(ii);

        lawn_pane.getChildren().add(sun);
        ImageView temptemp_sun =(ImageView) lawn_pane.getChildren().get(lawn_pane.getChildren().size()-1);
        temptemp_sun.setX(flower.getX());
        temptemp_sun.setY(flower.getY());
        plant.setSunImage(temptemp_sun);
        sunSequence(plant);

//


    }

    public void sunSequence(Producer plant){
        ImageView sunImage = plant.getSunImage();
        sunTokenTrans = new TranslateTransition(
                Duration.seconds(5),sunImage);

        sunTokenTrans.setCycleCount(1);
        sunTokenTrans.setToX(221 - sunImage.getX());
        sunTokenTrans.setToY(2 - sunImage.getY());

        PauseTransition pause = new PauseTransition(Duration.seconds(1));
        SequentialTransition seq = new SequentialTransition(sunTokenTrans, pause);
        seq.setCycleCount(Timeline.INDEFINITE);
        plant.setTransition(seq);
        seq.play();
        pause.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                sunCounter = sunCounter + 50;
                sunTokenText.setText(String.valueOf(sunCounter));
            }
        });

    }

    public void sun_tokes_falling()
    {
        Image ii=null;
        try {
            ii = new Image(new FileInputStream(
                    "src/resources_not/sun.gif"));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Random rand=new Random();

        for (int i=0;i<1;i++)
        {
            int r = rand.nextInt((600 - 200)+1)+200;
            ImageView sun = new ImageView(ii);
            lawn_pane.getChildren().add(sun);

            ImageView sun2 = (ImageView) lawn_pane.getChildren().get(lawn_pane.getChildren().size()-1);
            sun_lists.add(sun2);
            sun2.setX(r);
            sun2.setY(0);
            sun2.setVisible(true);

            sunTranslate = new TranslateTransition(Duration.seconds(10),sun2);


            sun_fall(sun2,rand);
//            sunn();
            sunOnClick(sun2,rand);
            //
            // sun_on_falling_finish(sun2,rand);
        }
    }
    public void sun_fall(ImageView s, Random r)
    {

        System.out.println(s.getY());
        s.setVisible(true);
        s.setX(r.nextInt((600 - 200)+1)+200);
        s.setY(0);
        System.out.println(s.getY());


        sunTranslate.setFromY(-100);
        sunTranslate.setToY(300);
        sunTranslate.setCycleCount(1);

        sunTranslate.play();

    }


    public void sunOnClick(ImageView s, Random r)
    {


        s.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                s.setVisible(false);
                sunTranslate.stop();
                sunCounter = sunCounter + 50;
                sunTokenText.setText(String.valueOf(sunCounter));
                System.out.println(sunCounter);
                check_if_tile_allowed(sunCounter);
                sun_fall(s,r);


            }
        });
    }

    private void check_if_tile_allowed(int sun_count){

        if(sun_count<50)
        {
            pea_tile.setDisable(true);
            pea_tile.setOpacity(0.5);

            sun_tile.setDisable(true);
            sun_tile.setOpacity(0.5);

            walnut_tile.setDisable(true);
            walnut_tile.setOpacity(0.5);

            mine_tile.setDisable(true);
            mine_tile.setOpacity(0.5);
        }
        else if(sun_count>=50 && sun_count<100)
        {
            pea_tile.setDisable(true);
            pea_tile.setOpacity(0.5);

            mine_tile.setDisable(true);
            mine_tile.setOpacity(0.5);

            sun_tile.setDisable(false);
            sun_tile.setOpacity(1);

            walnut_tile.setDisable(false);
            walnut_tile.setOpacity(1);

        }
        else if(sun_count>=100 && sun_count<150)
        {
            pea_tile.setDisable(false);
            pea_tile.setOpacity(1);

            mine_tile.setDisable(true);
            mine_tile.setOpacity(0.5);

            sun_tile.setDisable(false);
            sun_tile.setOpacity(1);

            walnut_tile.setDisable(false);
            walnut_tile.setOpacity(1);
        }
        else{
            pea_tile.setDisable(false);
            pea_tile.setOpacity(1);

            mine_tile.setDisable(false);
            mine_tile.setOpacity(1);

            sun_tile.setDisable(false);
            sun_tile.setOpacity(1);

            walnut_tile.setDisable(false);
            walnut_tile.setOpacity(1);
        }

    }

    public void takeDamage(Plant plant, Zombie zombie, int damage){
        //Handle removal from list


        if(plant.getHP()>0){
            System.out.println("Damage done was 20");
            System.out.println(plant.getHP());
            plant.reduceHP(damage);
            if(plant.getHP()<=0) {
                System.out.println("Plant Dead");
                removePlant(plant);
                lawn_pane.getChildren().remove(plant.getImageView());
                plant.getImageView().setY(1000);
                if(plant instanceof Shooter){
                    Shooter tempShooter = (Shooter) plant;
                    tempShooter.getPea().getTranslateTransition().stop();
                    lawn_pane.getChildren().remove(tempShooter.getPea().getImageView());

                }

                if(plant instanceof Producer){
                    Producer tempProducer = (Producer) plant;
                    tempProducer.getTransition().stop();
                    lawn_pane.getChildren().remove(tempProducer.getSunImage());

                }

                zombie.getZombTrans().play();
                timeline.stop();
            }
            if(zombie.getHP()<=0){
                timeline.stop();
            }
            // throw new PlantDeadException();
        }
//        else if(zombie.getHP()<=0){
//            System.out.println("Zombie Dead");
//
//        }
    }

    public void removePlant(Plant plant){
        int rows = plants_matrix.length;
        int cols = plants_matrix[0].length;
        for(int i=0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                if(plants_matrix[i][j]==plant){
                    plants_matrix[i][j] = null;
                    break;
                }
            }
        }
    }

    private StackPane pause_menu;
    private Pane pause_menu_pane;
    private ImageView pause_menu_bg;
    private ImageView pause_menu_resume_game;
    private ImageView pause_menu_save_game;
    private ImageView pause_menu_exit_to_menu;
    private ImageView pause_menu_back_to_game;



    private void pause_menu_launch()
    {
        pause_menu = new StackPane();
        pause_menu.setLayoutX(246);
        pause_menu.setLayoutY(0);
        pause_menu.setPrefWidth(427);
        pause_menu.setPrefHeight(450);



        pause_menu_pane = new Pane();
        pause_menu_pane.prefHeight(200);
        pause_menu_pane.prefWidth(200);

        Image i = new Image("resources_not/shovel.png");


        pause_menu_bg = new ImageView("resources_not/pause.png");
        pause_menu_bg.setFitWidth(390);
        pause_menu_bg.setFitHeight(459);

        pause_menu_resume_game = resume_gam; //new ImageView("resources_not/shovel.png");
//        pause_menu_resume_game.setImage(i);
        pause_menu_resume_game.setFitHeight(200);
        pause_menu_resume_game.setFitWidth(45);
        pause_menu_resume_game.setLayoutX(93);
        pause_menu_resume_game.setLayoutY(147);

        pause_menu_save_game = save_game;// new ImageView();
//        pause_menu_save_game.setImage(i);
        pause_menu_resume_game.setFitHeight(200);
        pause_menu_resume_game.setFitWidth(45);
        pause_menu_resume_game.setLayoutX(93);
        pause_menu_resume_game.setLayoutY(219);

        pause_menu_exit_to_menu = exit_to_menu;// new ImageView();
//        pause_menu_exit_to_menu.setImage(i);
        pause_menu_resume_game.setFitHeight(200);
        pause_menu_resume_game.setFitWidth(45);
        pause_menu_resume_game.setLayoutX(93);
        pause_menu_resume_game.setLayoutY(287);

        pause_menu_back_to_game = play; // new ImageView();
//        pause_menu_back_to_game.setImage(i);
        pause_menu_resume_game.setFitHeight(303);
        pause_menu_resume_game.setFitWidth(65);
        pause_menu_resume_game.setLayoutX(41);
        pause_menu_resume_game.setLayoutY(365);

        lawn_pane.getChildren().add(pause_menu);
        StackPane temp_pause_menu = (StackPane) lawn_pane.getChildren().get(lawn_pane.getChildren().size()-1);
        temp_pause_menu.getChildren().add(pause_menu_pane);
        Pane temp_pause_menu_pane = (Pane) temp_pause_menu.getChildren().get(temp_pause_menu.getChildren().size()-1);
        temp_pause_menu_pane.getChildren().add(pause_menu_bg);
        temp_pause_menu_pane.getChildren().add(pause_menu_resume_game);
        ImageView temp_res_game = (ImageView) temp_pause_menu_pane.getChildren().get(temp_pause_menu_pane.getChildren().size()-1);
        temp_pause_menu_pane.getChildren().add(pause_menu_save_game);
        ImageView temp_save_game = (ImageView) temp_pause_menu_pane.getChildren().get(temp_pause_menu_pane.getChildren().size()-1);
        temp_pause_menu_pane.getChildren().add(pause_menu_exit_to_menu);
        ImageView temp_exit_to_menu = (ImageView) temp_pause_menu_pane.getChildren().get(temp_pause_menu_pane.getChildren().size()-1);
        temp_pause_menu_pane.getChildren().add(pause_menu_back_to_game);
        ImageView temp_back_to_game = (ImageView) temp_pause_menu_pane.getChildren().get(temp_pause_menu_pane.getChildren().size()-1);



        set_on_click_list_resume_game(temp_pause_menu,temp_res_game);
        set_on_click_list_save_game(temp_pause_menu,temp_save_game);
        set_on_click_list_exit_to_menu(temp_pause_menu,temp_exit_to_menu);
        set_on_click_list_back_to_game(temp_pause_menu,temp_back_to_game);

    }

    public void set_on_click_list_resume_game(StackPane stack, ImageView temp)
    {
        System.out.println("hellllo");
        temp.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                stack.setVisible(false);
                lawn_pane.getChildren().remove(stack);

            }
        });
    }
    public void set_on_click_list_save_game(StackPane stack, ImageView temp)
    {
        temp.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("1");
            }
        });
    }
    public void set_on_click_list_exit_to_menu(StackPane stack, ImageView temp)
    {
        temp.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    return_to_main_menu();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public void set_on_click_list_back_to_game(StackPane stack, ImageView temp)
    {
        temp.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                lawn_pane.getChildren().remove(stack);
                plantPlay();
                playZombies();
                sunTranslate.play();
            }
        });
    }

    public void pause(){
        pause.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                pause_menu_launch();
                zombiePause();
                plantPause();
                sunTranslate.pause();


            }
        });
    }

    public void zombiePause(){
        try{
            if(zombieWave1.size()!=0) {
                for (Zombie zombie : zombieWave1) {
                    zombie.getZombTrans().pause();
                    zombiesPaused.add(zombie);
                }
            }

        }

        catch (NullPointerException e){
            System.out.println("Wave 1 stuff");
        }
        try {
            if (zombieWave2.size() != 0) {
                for (Zombie zombie : zombieWave2) {
                    zombie.getZombTrans().pause();
                    zombiesPaused.add(zombie);

                }
            }
        }

        catch (NullPointerException e){
            System.out.println("Wave 2 not here yet");
        }

        try {
            if (zombieWave3.size() != 0) {
                for (Zombie zombie : zombieWave3) {
                    zombie.getZombTrans().pause();
                    zombiesPaused.add(zombie);
                }
            }
        }

        catch (NullPointerException e){
            System.out.println("Wave 3 not here yet");
        }
    }

    public void plantPause(){
        int rows = plants_matrix.length;
        int cols = plants_matrix[0].length;
        for(int i=0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                if(plants_matrix[i][j]!=null){
                    if(plants_matrix[i][j] instanceof Producer){
                        Producer producer = (Producer)plants_matrix[i][j];
                        producer.getTransition().pause();
                    }
                    else if(plants_matrix[i][j] instanceof Shooter){
                        Shooter shooter = (Shooter) plants_matrix[i][j];
                        shooter.getPea().getTranslateTransition().pause();
                    }
                }
            }
        }
    }

    public void plantPlay() {
        int rows = plants_matrix.length;
        int cols = plants_matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (plants_matrix[i][j] != null) {
                    if (plants_matrix[i][j] instanceof Producer) {
                        Producer producer = (Producer) plants_matrix[i][j];
                        producer.getTransition().play();
                    } else if (plants_matrix[i][j] instanceof Shooter) {
                        Shooter shooter = (Shooter) plants_matrix[i][j];
                        shooter.getPea().getTranslateTransition().play();
                    }
                }
            }
        }
    }
    public void playZombies(){
        for(Zombie zombie: zombiesPaused){
            zombie.getZombTrans().play();
        }
    }
}





