    @RequestMapping("file")
    public String upload(@RequestPart("myfile")MultipartFile file) throws IOException {
        // todo:1.上传文件目录(配置)

        // todo:2.生成动态的文件名(包含后缀)

        // 保存文件
        file.transferTo(new File("D:\\"));
        return "上传成功";
    }
