package com.learn;

import java.util.*;

public class SortLearn {

    public static List<Integer> sortByQ(List<Integer> datas){
        if(datas.size() == 1){
            return datas;
        }
        if(datas.size() == 0){
            return new LinkedList<Integer>();
        }
        int shuzhi = datas.get(0);

        LinkedList<Integer> bigs = new LinkedList();
        LinkedList<Integer> simal = new LinkedList();
        for (int data: datas) {
            if(data < shuzhi){
                simal.add(data);
            }else if(data > shuzhi){
                bigs.add(data);
            }else {

            }
        }
        List<Integer> sortBigs = sortByQ(bigs);
        List<Integer> sortSimal = sortByQ(simal);
        sortBigs.add(shuzhi);
        sortBigs.addAll(sortSimal);
        return sortBigs;
    }

    public static List<Integer> sortByM(List<Integer> datas){
        Integer[] toArray = datas.toArray(new Integer[datas.size()]);
        int size = toArray.length;
        for(int i = 0;i < size ;i++){
            for(int j = i + 1; j < size; j++){
                if(toArray[i] < toArray[j]) {
                    int tmp = toArray[i];
                    toArray[i] = toArray[j];
                    toArray[j] = tmp;
                }

            }
        }
        return Arrays.asList(toArray);
    }



    public static List<Integer> sortByG(List<Integer> datas){
        if(datas.size() == 1){
            return datas;
        }
        if(datas.size() == 0){
            return new ArrayList<Integer>();
        }
        if(datas.size() == 2){
            List<Integer> res = new ArrayList<Integer>(2);
            if(datas.get(0) < datas.get(1)){
                res.add(datas.get(0));
                res.add(datas.get(1));
            }else {
                res.add(datas.get(1));
                res.add(datas.get(0));
            }
            return res;
        }
        int size = datas.size();
        int i = size/2;

        List<Integer> simal = new ArrayList<Integer>(i);
        List<Integer> bigs = new ArrayList<Integer>(datas.size() - i);

        for(int j = 0;j < size; j++){
            if(j < i){
                simal.add(datas.get(j));
            }else {
                bigs.add(datas.get(j));
            }
        }
        List<Integer> sortBigs = sortByG(bigs);
        List<Integer> sortSimal = sortByG(simal);
        List<Integer> hebing = hebing(sortSimal, sortBigs);
        return hebing;
    }

    public static List<Integer> hebing(List<Integer> list1, List<Integer> list2){
        Iterator<Integer> iterator = list2.iterator();
        List<Integer> all = new LinkedList<Integer>();
        Integer from2 = null;
        for(Integer i : list1){
            if(from2 != null && from2 < i){
                all.add(from2);
                from2 = null;
            }
            while ((from2 == null || from2 < i) && iterator.hasNext()){
                from2 = iterator.next();
                if(from2 < i){
                    all.add(from2);
                    from2 = null;
                }else{
                    break;
                }
            }
            all.add(i);
        }
        if(from2 != null){
            all.add(from2);
        }
        while (iterator.hasNext()){
            all.add(iterator.next());
        }
        return all;
    }




}
