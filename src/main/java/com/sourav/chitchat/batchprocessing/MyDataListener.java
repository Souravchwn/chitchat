//package com.sourav.chitchat.batchprocessing;
//
//import com.alibaba.excel.context.AnalysisContext;
//import com.alibaba.excel.event.AnalysisEventListener;
//import org.springframework.batch.item.Chunk;
//import org.springframework.batch.item.ItemWriter;
//import org.springframework.context.annotation.Configuration;
//
///**
// * Created by souravkumarchowhan on 29/06/2025
// *
// * @author : souravkumarchowhan
// * @Date : 29/06/2025
// * @File : {@link MyDataListener}
// */
//@Configuration
//public class MyDataListener extends AnalysisEventListener<ExcelReqDto> {
//    private final Chunk<ExcelReqDto> buffer = new Chunk<>();
//    private final ItemWriter<ExcelReqDto> itemWriter;
//    private final int chunkSize = 1000;
//
//    public MyDataListener(ItemWriter<ExcelReqDto> itemWriter) {
//        this.itemWriter = itemWriter;
//    }
//
//    @Override
//    public void invoke(ExcelReqDto excelReqDto, AnalysisContext analysisContext) {
//        buffer.add(excelReqDto);
//        if (buffer.size() >= chunkSize) {
//            flush();
//        }
//    }
//
//    @Override
//    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
//        flush();
//    }
//
//    private void flush() {
//        try {
//            itemWriter.write(buffer);
//        } catch (Exception e) {
//            throw new RuntimeException("Write failed", e);
//        }
//        buffer.clear();
//    }
//}
