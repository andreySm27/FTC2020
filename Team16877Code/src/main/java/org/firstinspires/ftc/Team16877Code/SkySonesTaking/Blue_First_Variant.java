package org.firstinspires.ftc.Team16877Code.SkySonesTaking;

//import

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;
import java.util.List;

import org.firstinspires.ftc.Team16877Code.AutonautsAPI;
import org.firstinspires.ftc.robotcore.external.ClassFactory;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer.CameraDirection;
import org.firstinspires.ftc.robotcore.external.tfod.TFObjectDetector;
import org.firstinspires.ftc.robotcore.external.tfod.Recognition;

import static java.lang.Math.abs;

@Autonomous(name="BYXX")
public class Blue_First_Variant extends AutonautsAPI {

    @Override
    public void runOpMode() {

        boolean i = true;
        INIT();
        telemetry.addData("Status", "Initialized");
        telemetry.update();

//        leftFront  = hardwareMap.get(DcMotor.class, "MotorFrontLeft");
//        rightFront = hardwareMap.get(DcMotor.class, "MotorFrontRight");
//        leftBack   = hardwareMap.get(DcMotor.class, "MotorBackLeft");
//        rightBack  = hardwareMap.get(DcMotor.class, "MotorBackRight");
//
//        getServo = hardwareMap.get(Servo.class, "getServo");
//        foundation1 = hardwareMap.get(Servo.class, "servoFoundation1");
//        foundation2 = hardwareMap.get(Servo.class, "servoFoundation2");
//
//
//        leftFront.setMode  (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        leftBack.setMode   (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        rightFront.setMode (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        rightBack.setMode  (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//
//        waitForStart();
//        runtime.reset();

        while (opModeIsActive()) {
            if(i){
                gettingServo(false);
                runRight(0.40,0.85);
                runForward(0.9,0.85);
                gettingServo(true);
                sleep(200);
                runBack(0.8,0.85);
                runLeft(0.95,0.85);
                gettingServo(false);
                sleep(200);
                runBack(0.10,0.85);

                runRight(1.65,0.85);

                runForward(0.9, 0.85);
                gettingServo(true);
                sleep(200);
                runBack(0.8, 0.85);
                runLeft(1.85, 0.85);
                gettingServo(false);
                sleep(200);
                runBack(0.10, 0.85);
                runRight(0.35, 0.85);

                i = !i;
            }
        }
    }
//    private void runForward(double meters,double power){
//        leftFront.setMode  (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        leftBack.setMode   (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        rightFront.setMode (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        rightBack.setMode  (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//
//        leftFront.setTargetPosition((int)(MOTOR_TO_REV_TICKS*(meters/DIAMETR_WHEEL)));
//        leftBack.setTargetPosition((int)(MOTOR_TO_REV_TICKS*(meters/DIAMETR_WHEEL)));
//        rightFront.setTargetPosition((int)(-MOTOR_TO_REV_TICKS*(meters/DIAMETR_WHEEL)));
//        rightBack.setTargetPosition((int)(-MOTOR_TO_REV_TICKS*(meters/DIAMETR_WHEEL)));
//
//        leftFront.setMode  (DcMotor.RunMode.RUN_TO_POSITION);
//        leftBack.setMode   (DcMotor.RunMode.RUN_TO_POSITION);
//        rightFront.setMode (DcMotor.RunMode.RUN_TO_POSITION);
//        rightBack.setMode  (DcMotor.RunMode.RUN_TO_POSITION);
//
//        leftFront.setPower(-power);
//        leftBack.setPower(-power);
//        rightFront.setPower(power);
//        rightBack.setPower(power);
//
//        while (leftFront.isBusy() && leftBack.isBusy() && rightFront.isBusy() && rightBack.isBusy()){
//            telemetry.addData("WAITING","GOING");
//            telemetry.addData("LF",  leftFront.getCurrentPosition());
//            telemetry.addData("RF",  rightFront.getCurrentPosition());
//            telemetry.addData("LB",  leftBack.getCurrentPosition());
//            telemetry.addData("RB",  rightBack.getCurrentPosition());
//            telemetry.update();
//        }
//        rightBack.setPower(0);
//        rightFront.setPower(0);
//        leftBack.setPower(0);
//        leftFront.setPower(0);
//
//
//    }
//    private void runRight(double meters,double power){
//        leftFront.setMode  (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        leftBack.setMode   (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        rightFront.setMode (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        rightBack.setMode  (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//
//
//
//        leftFront.setTargetPosition((int)(MOTOR_TO_REV_TICKS*(meters/DIAMETR_WHEEL_SIDE)));
//        leftBack.setTargetPosition((int)(-MOTOR_TO_REV_TICKS*(meters/DIAMETR_WHEEL_SIDE)));
//        rightFront.setTargetPosition((int)(MOTOR_TO_REV_TICKS*(meters/DIAMETR_WHEEL_SIDE)));
//        rightBack.setTargetPosition((int)(-MOTOR_TO_REV_TICKS*(meters/DIAMETR_WHEEL_SIDE)));
//
//        leftFront.setMode  (DcMotor.RunMode.RUN_TO_POSITION);
//        leftBack.setMode   (DcMotor.RunMode.RUN_TO_POSITION);
//        rightFront.setMode (DcMotor.RunMode.RUN_TO_POSITION);
//        rightBack.setMode  (DcMotor.RunMode.RUN_TO_POSITION);
//
//        leftFront.setPower(-power);
//        leftBack.setPower(power);
//        rightFront.setPower(-power);
//        rightBack.setPower(power);
//
//        while (leftFront.isBusy() && leftBack.isBusy() && rightFront.isBusy() && rightBack.isBusy()){
//            telemetry.addData("WAITING","GOING");
//            telemetry.addData("LF",  leftFront.getCurrentPosition());
//            telemetry.addData("RF",  rightFront.getCurrentPosition());
//            telemetry.addData("LB",  leftBack.getCurrentPosition());
//            telemetry.addData("RB",  rightBack.getCurrentPosition());
//            telemetry.update();
//        }
//        rightBack.setPower(0);
//        rightFront.setPower(0);
//        leftBack.setPower(0);
//        leftFront.setPower(0);
//
//
//    }
//    private void runRightPos(int pos,double power){
//        leftFront.setMode  (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        leftBack.setMode   (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        rightFront.setMode (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        rightBack.setMode  (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//
//
//
//        leftFront.setTargetPosition(pos);
//        leftBack.setTargetPosition(-pos);
//        rightFront.setTargetPosition(pos);
//        rightBack.setTargetPosition(-pos);
//
//        leftFront.setMode  (DcMotor.RunMode.RUN_TO_POSITION);
//        leftBack.setMode   (DcMotor.RunMode.RUN_TO_POSITION);
//        rightFront.setMode (DcMotor.RunMode.RUN_TO_POSITION);
//        rightBack.setMode  (DcMotor.RunMode.RUN_TO_POSITION);
//
//        leftFront.setPower(-power);
//        leftBack.setPower(power);
//        rightFront.setPower(-power);
//        rightBack.setPower(power);
//
//        while (leftFront.isBusy() && leftBack.isBusy() && rightFront.isBusy() && rightBack.isBusy()){
//            telemetry.addData("WAITING","GOING");
//            telemetry.addData("LF",  leftFront.getCurrentPosition());
//            telemetry.addData("RF",  rightFront.getCurrentPosition());
//            telemetry.addData("LB",  leftBack.getCurrentPosition());
//            telemetry.addData("RB",  rightBack.getCurrentPosition());
//            telemetry.update();
//        }
//        rightBack.setPower(0);
//        rightFront.setPower(0);
//        leftBack.setPower(0);
//        leftFront.setPower(0);
//
//
//    }
//    private void runLeft(double meters,double power){
//        leftFront.setMode  (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        leftBack.setMode   (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        rightFront.setMode (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        rightBack.setMode  (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//
//
//
//        leftFront.setTargetPosition((int)(-MOTOR_TO_REV_TICKS*(meters/DIAMETR_WHEEL_SIDE)));
//        leftBack.setTargetPosition((int)(MOTOR_TO_REV_TICKS*(meters/DIAMETR_WHEEL_SIDE)));
//        rightFront.setTargetPosition((int)(-MOTOR_TO_REV_TICKS*(meters/DIAMETR_WHEEL_SIDE)));
//        rightBack.setTargetPosition((int)(MOTOR_TO_REV_TICKS*(meters/DIAMETR_WHEEL_SIDE)));
//
//        leftFront.setMode  (DcMotor.RunMode.RUN_TO_POSITION);
//        leftBack.setMode   (DcMotor.RunMode.RUN_TO_POSITION);
//        rightFront.setMode (DcMotor.RunMode.RUN_TO_POSITION);
//        rightBack.setMode  (DcMotor.RunMode.RUN_TO_POSITION);
//
//        leftFront.setPower(power);
//        leftBack.setPower(-power);
//        rightFront.setPower(power);
//        rightBack.setPower(-power);
//
//        while (leftFront.isBusy() && leftBack.isBusy() && rightFront.isBusy() && rightBack.isBusy()){
//            telemetry.addData("WAITING","GOING");
//            telemetry.addData("LF",  leftFront.getCurrentPosition());
//            telemetry.addData("RF",  rightFront.getCurrentPosition());
//            telemetry.addData("LB",  leftBack.getCurrentPosition());
//            telemetry.addData("RB",  rightBack.getCurrentPosition());
//            telemetry.update();
//        }
//        rightBack.setPower(0);
//        rightFront.setPower(0);
//        leftBack.setPower(0);
//        leftFront.setPower(0);
//
//
//    }
//    private void runLeftDetectSkyStone(double meters,double power){
//        leftFront.setMode  (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        leftBack.setMode   (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        rightFront.setMode (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        rightBack.setMode  (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//
//
//        leftFront.setTargetPosition((int)(-MOTOR_TO_REV_TICKS*(meters/DIAMETR_WHEEL_SIDE)));
//        leftBack.setTargetPosition((int)(MOTOR_TO_REV_TICKS*(meters/DIAMETR_WHEEL_SIDE)));
//        rightFront.setTargetPosition((int)(-MOTOR_TO_REV_TICKS*(meters/DIAMETR_WHEEL_SIDE)));
//        rightBack.setTargetPosition((int)(MOTOR_TO_REV_TICKS*(meters/DIAMETR_WHEEL_SIDE)));
//
//        leftFront.setMode  (DcMotor.RunMode.RUN_TO_POSITION);
//        leftBack.setMode   (DcMotor.RunMode.RUN_TO_POSITION);
//        rightFront.setMode (DcMotor.RunMode.RUN_TO_POSITION);
//        rightBack.setMode  (DcMotor.RunMode.RUN_TO_POSITION);
//
//        leftFront.setPower(power);
//        leftBack.setPower(-power);
//        rightFront.setPower(power);
//        rightBack.setPower(-power);
//
//        while (leftFront.isBusy() && leftBack.isBusy() && rightFront.isBusy() && rightBack.isBusy()){
//            if(skyStoneDetect()){
//
//                rightBack.setPower(0);
//                rightFront.setPower(0);
//                leftBack.setPower(0);
//                leftFront.setPower(0);
//
//                int posSkyStone = abs(leftFront.getCurrentPosition());
//
//                leftFront.setMode  (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//                leftBack.setMode   (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//                rightFront.setMode (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//                rightBack.setMode  (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//
//                getSkyStone();
//                runRightPos(posSkyStone,0.5);
//                gettingServo(false);
//
//            }
//            telemetry.addData("WAITING","GOING");
//            telemetry.addData("LF",  leftFront.getCurrentPosition());
//            telemetry.addData("RF",  rightFront.getCurrentPosition());
//            telemetry.addData("LB",  leftBack.getCurrentPosition());
//            telemetry.addData("RB",  rightBack.getCurrentPosition());
//            telemetry.update();
//        }
//        rightBack.setPower(0);
//        rightFront.setPower(0);
//        leftBack.setPower(0);
//        leftFront.setPower(0);
//
//
//    }
//    private void runBack(double meters,double power){
//        leftFront.setMode  (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        leftBack.setMode   (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        rightFront.setMode (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        rightBack.setMode  (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//
//
//
//        leftFront.setTargetPosition((int)(-MOTOR_TO_REV_TICKS*(meters/DIAMETR_WHEEL)));
//        leftBack.setTargetPosition((int)(-MOTOR_TO_REV_TICKS*(meters/DIAMETR_WHEEL)));
//        rightFront.setTargetPosition((int)(MOTOR_TO_REV_TICKS*(meters/DIAMETR_WHEEL)));
//        rightBack.setTargetPosition((int)(MOTOR_TO_REV_TICKS*(meters/DIAMETR_WHEEL)));
//
//        leftFront.setMode  (DcMotor.RunMode.RUN_TO_POSITION);
//        leftBack.setMode   (DcMotor.RunMode.RUN_TO_POSITION);
//        rightFront.setMode (DcMotor.RunMode.RUN_TO_POSITION);
//        rightBack.setMode  (DcMotor.RunMode.RUN_TO_POSITION);
//
//        leftFront.setPower(power);
//        leftBack.setPower(power);
//        rightFront.setPower(-power);
//        rightBack.setPower(-power);
//
//        while (leftFront.isBusy() && leftBack.isBusy() && rightFront.isBusy() && rightBack.isBusy()){
//            telemetry.addData("WAITING","GOING");
//            telemetry.addData("LF",  leftFront.getCurrentPosition());
//            telemetry.addData("RF",  rightFront.getCurrentPosition());
//            telemetry.addData("LB",  leftBack.getCurrentPosition());
//            telemetry.addData("RB",  rightBack.getCurrentPosition());
//            telemetry.update();
//        }
//        rightBack.setPower(0);
//        rightFront.setPower(0);
//        leftBack.setPower(0);
//        leftFront.setPower(0);
//
//
//    }
//    private void initVuforia() {
//        VuforiaLocalizer.Parameters parameters = new VuforiaLocalizer.Parameters();
//
//        parameters.vuforiaLicenseKey = VUFORIA_KEY;
//        parameters.cameraDirection = CameraDirection.BACK;
//
//        vuforia = ClassFactory.getInstance().createVuforia(parameters);
//    }
//    private void initTfod() {
//        int tfodMonitorViewId = hardwareMap.appContext.getResources().getIdentifier(
//                "tfodMonitorViewId", "id", hardwareMap.appContext.getPackageName());
//        TFObjectDetector.Parameters tfodParameters = new TFObjectDetector.Parameters(tfodMonitorViewId);
//        tfodParameters.minimumConfidence = 0.8;
//        tfod = ClassFactory.getInstance().createTFObjectDetector(tfodParameters, vuforia);
//        tfod.loadModelFromAsset(TFOD_MODEL_ASSET, LABEL_FIRST_ELEMENT, LABEL_SECOND_ELEMENT);
//    }
//    private boolean skyStoneDetect(){
//        List<Recognition> updatedRecognitions = tfod.getUpdatedRecognitions();
//        if (updatedRecognitions != null) {
//            for (Recognition recognition : updatedRecognitions) {
//                if(recognition.getLabel().equals(LABEL_SECOND_ELEMENT)) {
//                    if (abs((int) ((recognition.getTop() + recognition.getBottom()) / 2) - 627) < 40) {
//                        return true;
//                    } else if (((recognition.getTop() + recognition.getBottom()) / 2) - 627 >= 40) {
//                        return false;
//                    } else if (((recognition.getTop() + recognition.getBottom()) / 2) - 627 <= -40) {
//                        return false;
//                    }
//                }
//            }
//        }
//        return false;
//    }
//    private void gettingServo(boolean i){
//        if(i) getServo.setPosition(0.6);
//        else getServo.setPosition(0);
//    }
//    private void setFoundation(boolean i){
//        if(i){
//            foundation1.setPosition(0);
//            foundation2.setPosition(1);
//        }else{
//            foundation1.setPosition(1);
//            foundation2.setPosition(0);
//        }
//    }
//    private void getSkyStone(){
//        runForward(0.65,0.5);
//        sleep(100);
//        gettingServo(true);
//        sleep(250);
//        runBack(0.65,0.5);
//    }
}
