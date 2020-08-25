-- Test Case: BASIS-PATH-009-PARTIAL
TEST.UNIT:VF222
TEST.SUBPROGRAM:Vf222_Mirrors_Positioning
TEST.NEW
TEST.NAME:BASIS-PATH-009-PARTIAL
TEST.BASIS_PATH:9 of 28 (partial)
TEST.NOTES:
This is an automatically generated test case.
   Test Path 9
      (1) if (PpDataCmdReadyOld != Vf222_Inputs.PpDataCmdReady) ==> FALSE
      (3) if (PpHorizzontal_MotorSts_DMCMOld != Vf222_Inputs.PpHorizzontal_MotorSts_DMCM) ==> FALSE
      (5) if (PpVertical_MotorSts_DMCMOld != Vf222_Inputs.PpVertical_MotorSts_DMCM) ==> FALSE
      (7) if (PpHorizzontal_MotorSts_PMCMOld != Vf222_Inputs.PpHorizzontal_MotorSts_PMCM) ==> FALSE
      (9) if (PpVertical_MotorSts_PMCMOld != Vf222_Inputs.PpVertical_MotorSts_PMCM) ==> FALSE
      (11) case (PositioningSelector) ==> 0
      (12) if (((((Vf222_Inputs.PpBCM_OperationalModeSts).OperationalModeStsInfoCalc == 4U || (Vf222_Inputs.PpBCM_OperationalModeSts).OperationalModeStsInfoCalc == 8U) || (Vf222_Inputs.PpBCM_OperationalModeSts).OperationalModeStsInfoCalc == 10U) || (Vf222_Inputs.PpBCM_OperationalModeSts).
OperationalModeStsInfoCalc == 2U) && PpDataCmdReadyEvent == 1) ==> TRUE
      (13) if (Vf222_Inputs.PpErrorSts_DMCM != 0U) ==> FALSE
      (15) if (Vf222_Inputs.PpErrorSts_PMCM != 0U) ==> FALSE
      (16) if (Vf222_Inputs.PpErrorSts_PMCM != 0U) ==> TRUE
      (17) if (((DriverHorizzontalAxialMotor == 1 || DriverVerticalAxialMotor == 1) || PassengerHorizzontalAxialMotor == 1) || PassengerVerticalAxialMotor == 1) ==> FALSE
      (25) if (Vf222_Outputs.PpLeft_Right_Motion_DMCM == 0U && Vf222_Outputs.PpUp_Down_Motion_DMCM == 0U) ==> FALSE
      (26) if (Vf222_Outputs.PpLeft_Right_Motion_PMCM == 0U && Vf222_Outputs.PpUp_Down_Motion_PMCM == 0U) ==> FALSE
      (27) if ((Vf222_Inputs.PpBCM_OperationalModeSts).OperationalModeStsInfoCalc == 4U || (Vf222_Inputs.PpBCM_OperationalModeSts).OperationalModeStsInfoCalc == 8U) ==> FALSE
      (28) if (PositioningSelector == 0) ==> FALSE
   Test Case Generation Notes:
      Cannot set local variable PpDataCmdReadyOld in branch 1
      Cannot set local variable PpHorizzontal_MotorSts_DMCMOld in branch 3
      Cannot set local variable PpVertical_MotorSts_DMCMOld in branch 5
      Cannot set local variable PpHorizzontal_MotorSts_PMCMOld in branch 7
      Cannot set local variable PpVertical_MotorSts_PMCMOld in branch 9
      Cannot set local variable PositioningSelector in branch 11
      Cannot set PpDataCmdReadyEvent due to assignment
      Conflict: Trying to set variable VF222.<<GLOBAL>>.Vf222_Inputs.PpErrorSts_PMCM 'equal to' and 'not equal to' same value in branches 15/16
      Cannot set DriverHorizzontalAxialMotor due to assignment
      Cannot set DriverVerticalAxialMotor due to assignment
      Cannot set PassengerHorizzontalAxialMotor due to assignment
      Cannot set local variable PassengerVerticalAxialMotor in branch 17
      Cannot set Vf222_Outputs.PpLeft_Right_Motion_DMCM due to assignment
      Cannot set Vf222_Outputs.PpUp_Down_Motion_DMCM due to assignment
      Cannot set Vf222_Outputs.PpLeft_Right_Motion_PMCM due to assignment
      Cannot set Vf222_Outputs.PpUp_Down_Motion_PMCM due to assignment
      Cannot set local variable PositioningSelector in branch 28
TEST.END_NOTES:
TEST.VALUE:VF222.<<GLOBAL>>.Vf222_Inputs.PpBCM_OperationalModeSts.OperationalModeStsInfoCalc:<<MIN>>
TEST.VALUE:VF222.<<GLOBAL>>.Vf222_Inputs.PpDataCmdReady:FALSE
TEST.VALUE:VF222.<<GLOBAL>>.Vf222_Inputs.PpHorizzontal_MotorSts_DMCM:Cx0_Not_Active
TEST.VALUE:VF222.<<GLOBAL>>.Vf222_Inputs.PpVertical_MotorSts_DMCM:Cx0_Not_Active
TEST.VALUE:VF222.<<GLOBAL>>.Vf222_Inputs.PpHorizzontal_MotorSts_PMCM:Cx0_Not_Active
TEST.VALUE:VF222.<<GLOBAL>>.Vf222_Inputs.PpVertical_MotorSts_PMCM:Cx0_Not_Active
TEST.VALUE:VF222.<<GLOBAL>>.Vf222_Inputs.PpErrorSts_DMCM:0
TEST.VALUE:VF222.<<GLOBAL>>.Vf222_Inputs.PpErrorSts_PMCM:0
TEST.END