    @RequestMapping("/getjson")
    public Object getJson(String name) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("ctime", LocalDateTime.now());
        return map;
    }
