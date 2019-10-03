package com.masscode.completerecyclerview.models;

import java.util.ArrayList;

public class MountainData {

    // array to store data that will be displayed on RecyclerView
    public static String[][] data = new String[][] {
            // copy from my gits, link in description
            // this data from wikipedia
            {"Mount Everest",
                    "8,848 m (29,029 ft)",
                    "https://upload.wikimedia.org/wikipedia/commons/f/f6/Everest_kalapatthar.jpg",
                    "Everest's first known summitting occurred by 1953, and interest by climbers increased. Despite the effort and attention poured into expeditions, only about 200 people had summitted by 1987. Everest remained a difficult climb for decades, even for serious attempts by professional climbers and large national expeditions, which were the norm until the commercial era began in the 1990s. By March 2012, Everest had been climbed 5,656 times with 223 deaths. Although lower mountains have longer or steeper climbs, Everest is so high the jet stream can hit it. Climbers can be faced with winds beyond 320 km/h (200 mph) when the weather shifts. At certain times of the year the jet stream shifts north, providing periods of relative calm at the mountain. Other dangers include blizzards and avalanches.",
                    "Nepal and China"},
            {"K2",
                    "8,611 m (28,251 ft)",
                    "https://upload.wikimedia.org/wikipedia/commons/1/12/K2_2006b.jpg",
                    "K2, also known as Mount Godwin-Austen or Chhogori, at 8,611 metres (28,251 ft) above sea level, is the second highest mountain in the world, after Mount Everest at 8,848 metres (29,029 ft). It is located on the China–Pakistan border between Baltistan in the Gilgit-Baltistan region of northern Pakistan, and the Taxkorgan Tajik Autonomous County of Xinjiang, China. K2 is the highest point of the Karakoram range and the highest point in both Pakistan and Xinjiang.",
                    "Pakistan"},
            {"Kangchenjunga",
                    "8,586 m (28,169 ft)",
                    "https://upload.wikimedia.org/wikipedia/commons/1/19/Kanchenjunga_from_Tiger_Hills.JPG",
                    "Kangchenjunga, also spelled Kanchenjunga, is the third highest mountain in the world. It rises with an elevation of 8,586 m (28,169 ft) in a section of the Himalayas called Kangchenjunga Himal delimited in the west by the Tamur River, in the north by the Lhonak Chu and Jongsang La, and in the east by the Teesta River. It lies between Nepal and Sikkim, India, with three of the five peaks (Main, Central, and South) directly on the border, and the remaining two (West and Kangbachen) in Nepal's Taplejung District.",
                    "Nepal and India"},
            {"Lhotse",
                    "8,516 m (27,940 ft)",
                    "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2018/09/010109090101/gunung-pemula-8-1024x767.jpg",
                    "Lhotse is the fourth highest mountain in the world at 8,516 metres (27,940 ft), after Mount Everest, K2, and Kangchenjunga. Part of the Everest massif, Lhotse is connected to the latter peak via the South Col. Lhotse means “South Peak” in Tibetan. In addition to the main summit at 8,516 metres (27,940 ft) above sea level, the mountain comprises the smaller peaks Lhotse Middle (East) at 8,414 m (27,605 ft), and Lhotse Shar at 8,383 m (27,503 ft). The summit is on the border between Tibet of China and the Khumbu region of Nepal.",
                    "Nepal and China"},
            {"Makalu",
                    "8,463 m (27,766 ft)",
                    "https://upload.wikimedia.org/wikipedia/commons/1/19/Makalu.jpg",
                    "Makalu is the fifth highest mountain in the world at 8,485 metres (27,838 ft). It is located in the Mahalangur Himalayas 19 km (12 mi) southeast of Mount Everest, on the border between Nepal and Tibet Autonomous Region, China. One of the eight-thousanders, Makalu is an isolated peak whose shape is a four-sided pyramid.",
                    "Nepal and China"},
            {"Cho Oyu",
                    "8,188 m (26,864 ft)",
                    "https://upload.wikimedia.org/wikipedia/commons/1/1c/ChoOyu-fromGokyo.jpg",
                    "Cho Oyu is the sixth-highest mountain in the world at 8,188 metres (26,864 ft) above sea level. Cho Oyu means \"Turquoise Goddess\" in Tibetan. The mountain is the westernmost major peak of the Khumbu sub-section of the Mahalangur Himalaya 20 km west of Mount Everest. The mountain stands on the China–Nepal border. Just a few kilometres west of Cho Oyu is Nangpa La (5,716m/18,753 ft), a glaciated pass that serves as the main trading route between the Tibetans and the Khumbu's Sherpas. This pass separates the Khumbu and Rolwaling Himalayas. Due to its proximity to this pass and the generally moderate slopes of the standard northwest ridge route, Cho Oyu is considered the easiest 8,000 metre peak to climb. It is a popular objective for professionally guided parties.",
                    "Nepal and China"},
            {"Dhaulagiri",
                    "8,167 m (26,795 ft)",
                    "https://upload.wikimedia.org/wikipedia/commons/5/5c/Dhaulagiri_mountain.jpg",
                    "The Dhaulagiri massif in Nepal extends 120 km (70 mi) from the Kaligandaki River west to the Bheri. This massif is bounded on the north and southwest by tributaries of the Bheri River and on the southeast by the Myagdi Khola. Dhaulagiri I is the seventh highest mountain in the world at 8,167 metres (26,795 ft) above sea level, and the highest mountain within the borders of a single country (Nepal). It was first climbed on 13 May 1960 by a Swiss/Austrian/Nepali expedition.",
                    "Nepal"},
            {"Manaslu",
                    "8,163 m (26,781 ft)",
                    "https://upload.wikimedia.org/wikipedia/commons/e/e0/Sunrise%2C_Manaslu.jpg",
                    "Manaslu is the eighth highest mountain in the world at 8,163 metres (26,781 ft) above sea level. It is located in the Mansiri Himal, part of the Nepalese Himalayas, in the west-central part of Nepal. Its name, which means \"mountain of the spirit\", comes from the Sanskrit word manasa, meaning \"intellect\" or \"soul\". Manaslu was first climbed on May 9, 1956 by Toshio Imanishi and Gyalzen Norbu, members of a Japanese expedition. It is said that \"just as the British consider Everest their mountain, Manaslu has always been a Japanese mountain\".",
                    "Nepal"},
            {"Nanga Parbat",
                    "8,126 m (26,660 ft)",
                    "https://upload.wikimedia.org/wikipedia/commons/3/35/Fairy_Meadows_and_the_view_of_Nanga_Parbat.jpg",
                    "Nanga Parbat is the ninth highest mountain in the world at 8,126 metres (26,660 ft) above sea level. Located in the Diamer District of Pakistan’s Gilgit Baltistan region, Nanga Parbat is the western anchor of the Himalayas. The name Nanga Parbat is derived from the Sanskrit words nagna and parvata which together mean \"Naked Mountain\". The mountain is locally known by its Tibetan name Diamer or Deo Mir, meaning \"huge mountain\".",
                    "Pakistan"},
            {"Annapurna",
                    "8,091 m (26,545 ft)",
                    "https://upload.wikimedia.org/wikipedia/commons/f/f2/South_Face_of_Annapurna_I_%28Main%29.jpg",
                    "Annapurna is a massif in the Himalayas in north-central Nepal that includes one peak over 8,000 metres (26,000 ft), thirteen peaks over 7,000 metres (23,000 ft), and sixteen more over 6,000 metres (20,000 ft). The massif is 55 kilometres (34 mi) long, and is bounded by the Kali Gandaki Gorge on the west, the Marshyangdi River on the north and east, and by Pokhara Valley on the south. At the western end the massif encloses a high basin called the Annapurna Sanctuary. Annapurna I Main is the tenth highest mountain in the world at 8,091 metres (26,545 ft) above sea level, and in 1950 Maurice Herzog led a French expedition to its summit, making it the first of the eight-thousanders to be climbed.",
                    "Nepal"}
    };

    public static ArrayList<Mountain> getListData() {
        Mountain mountain;
        ArrayList<Mountain> list = new ArrayList<>();

        for (String[] mData : data) {
            mountain = new Mountain();
            mountain.setName(mData[0]);
            mountain.setElevation(mData[1]);
            mountain.setPhoto(mData[2]);
            mountain.setDescription(mData[3]);
            mountain.setLocation(mData[4]);

            list.add(mountain);
        }

        return list;
    }

}
