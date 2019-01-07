(1)Set<Attraction> attractions; 
(2)attractions = new HashSet<>(); 
(3)return attractions.stream().anyMatch(e->e.getDesignation().equals(designation));
(4)return attractions.stream().collect(Collectors.toCollection(()->
      new TreeSet<>((a,b)->a.getType().compareTo(b.getType()))));
(5) implements Comparable<Attraction>{
(6) public int compareTo(Attraction o) {
        return this.designation.compareTo(o.getDesignation());}
(7) parc.put(a, new ArrayList<>());
(8) if (e.getAge() >= a.getAge_min() && e.getTicket() >= a.getNbr_ticket()) {
		parc.get(a).add(e);
        e.setTicket(e.getTicket()-a.getNbr_ticket());
        System.out.println("Enfant " + e.getNom() + " ajouté");
    } else { System.out.println("condition non satisfaite"); }
(9) return parc.get(a).stream().min((f, b) -> f.getAge() - b.getAge()).get();
(10)//java 7
  for (Enfant e : parc.get(a)) {
      int nb = 0;
      for (Enfant e1 : parc.get(a)) {
		if (e1.equals(e)) nb++; 
	  } if (nb > nbj) { eMax = e; }
    }
    // JAVA 8
        parc.get(a).forEach(e -> {
            int nb = 0;
            for (Enfant e1 : parc.get(a)) {
                if (e1.equals(e))nb++;
            } if (nb > nbj) { eMax = e; }
        });
        return eMax;
    }
(11)return parc.entrySet().stream()
     .max((a,b)->a.getValue().size()-b.getValue().size()).get().getKey();
(12)return parc.values().stream().reduce((l1,l2)->{ l1.addAll(l2); return l1;}).get()
	   .stream().map(s->s.getNom()).distinct().collect(Collectors.toList());
(13) TreeMap<Attraction, List<Enfant>> treeMap = new TreeMap<Attraction, List<Enfant>>(
(o1,o2)-> o1.getDesignation().compareTo(o2.getDesignation()));
treeMap.putAll(parc); return treeMap;
(14)return parc.values().stream().reduce((l1,l2)-> {l1.addAll(l2);return l1;}).get()
        .stream().collect(Collectors.groupingBy(Enfant::getAge));
(15)for (List<Enfant> le: parc.values()){
    for(Enfant e : le ){
        int nbrE = 0;
        for(List<Enfant> le1 : parc.values()){
            if(le1.contains(e))nbrE++; }
        if(nbrE>1)return true;
	}} return false;
(16): String url = "jdbc:mysql://172.18.200.54:3306/happyland"
(17): Connection cnx = DriverManager.getConnection(url,login,pwd);
(18): (age_min,type,designation,nbr_ticket)
(19): (15,"Enfant","SeaShark",3)  //Des valeurs au choix
(20): Statement st = cnx.createStatement();
(21): st.executeUpdate(requete);

