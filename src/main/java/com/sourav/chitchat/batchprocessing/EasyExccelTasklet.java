//package com.sourav.chitchat.batchprocessing;
//
//import com.alibaba.excel.EasyExcel;
//import org.springframework.batch.core.StepContribution;
//import org.springframework.batch.core.scope.context.ChunkContext;
//import org.springframework.batch.core.step.tasklet.Tasklet;
//import org.springframework.batch.item.ItemWriter;
//import org.springframework.batch.repeat.RepeatStatus;
//import org.springframework.stereotype.Component;
//
//import java.io.File;
//
///**
// * Created by souravkumarchowhan on 29/06/2025
// *
// * @author : souravkumarchowhan
// * @Date : 29/06/2025
// * @File : {@link EasyExccelTasklet}
// */
//@Component
//public class EasyExccelTasklet implements Tasklet {
//    private final ItemWriter<ExcelReqDto> itemWriter;
//
//    public EasyExccelTasklet(ItemWriter<ExcelReqDto> itemWriter) {
//        this.itemWriter = itemWriter;
//    }
//
//    private String filePath;
//
//    @Override
//    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
//        EasyExcel.read(new File(filePath), ExcelReqDto.class, new MyDataListener(itemWriter))
//                .sheet()
//                .doRead();
//        return RepeatStatus.FINISHED;
//    }
//}
