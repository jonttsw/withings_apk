package com.withings.comm.wpp;

import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.generated.object.AccountKey;
import com.withings.comm.wpp.generated.object.AcqFreq;
import com.withings.comm.wpp.generated.object.ActivityLap;
import com.withings.comm.wpp.generated.object.ActivityPause;
import com.withings.comm.wpp.generated.object.ActivitySubcategory;
import com.withings.comm.wpp.generated.object.Adc;
import com.withings.comm.wpp.generated.object.AdvKey;
import com.withings.comm.wpp.generated.object.Alarm;
import com.withings.comm.wpp.generated.object.AlarmEnabled;
import com.withings.comm.wpp.generated.object.AlarmId;
import com.withings.comm.wpp.generated.object.AlarmSetSimple;
import com.withings.comm.wpp.generated.object.AlgoParam;
import com.withings.comm.wpp.generated.object.AlgorithmVersion;
import com.withings.comm.wpp.generated.object.AltimeterCompensation;
import com.withings.comm.wpp.generated.object.AmazonAuth;
import com.withings.comm.wpp.generated.object.AmazonCodeChallenge;
import com.withings.comm.wpp.generated.object.AncsConfig;
import com.withings.comm.wpp.generated.object.AncsStatus;
import com.withings.comm.wpp.generated.object.AnsConfig;
import com.withings.comm.wpp.generated.object.AnsStatus;
import com.withings.comm.wpp.generated.object.AppProbe;
import com.withings.comm.wpp.generated.object.AppProbeOsVersion;
import com.withings.comm.wpp.generated.object.As6221MeasureResult;
import com.withings.comm.wpp.generated.object.AssocToken;
import com.withings.comm.wpp.generated.object.Audiotest;
import com.withings.comm.wpp.generated.object.Backlight;
import com.withings.comm.wpp.generated.object.BatteryPercent;
import com.withings.comm.wpp.generated.object.BatteryStateOpt;
import com.withings.comm.wpp.generated.object.BatteryStatus;
import com.withings.comm.wpp.generated.object.BatteryStatusSamples;
import com.withings.comm.wpp.generated.object.BatteryVoltageMv;
import com.withings.comm.wpp.generated.object.BleLinkStatus;
import com.withings.comm.wpp.generated.object.BleShellChallenge;
import com.withings.comm.wpp.generated.object.Boolean;
import com.withings.comm.wpp.generated.object.BootstrapRedirect;
import com.withings.comm.wpp.generated.object.BreatheParam;
import com.withings.comm.wpp.generated.object.Bssid;
import com.withings.comm.wpp.generated.object.CacheType;
import com.withings.comm.wpp.generated.object.CalibrationPoint;
import com.withings.comm.wpp.generated.object.CalibrationSession;
import com.withings.comm.wpp.generated.object.CalibrationType;
import com.withings.comm.wpp.generated.object.Calories;
import com.withings.comm.wpp.generated.object.CaptureSct01;
import com.withings.comm.wpp.generated.object.CartridgeExpiryDate;
import com.withings.comm.wpp.generated.object.CartridgeState;
import com.withings.comm.wpp.generated.object.CborData;
import com.withings.comm.wpp.generated.object.CertDer;
import com.withings.comm.wpp.generated.object.ChallengeRequest;
import com.withings.comm.wpp.generated.object.CleansingModeStart;
import com.withings.comm.wpp.generated.object.CleansingModeStatus;
import com.withings.comm.wpp.generated.object.ClockDisplaySetting;
import com.withings.comm.wpp.generated.object.Cmderror;
import com.withings.comm.wpp.generated.object.Color;
import com.withings.comm.wpp.generated.object.ColorHsl;
import com.withings.comm.wpp.generated.object.ColorHsv;
import com.withings.comm.wpp.generated.object.ColorRgb;
import com.withings.comm.wpp.generated.object.CommSupport;
import com.withings.comm.wpp.generated.object.ConnectReason;
import com.withings.comm.wpp.generated.object.ConnectResultExt;
import com.withings.comm.wpp.generated.object.CovidEbidEcc;
import com.withings.comm.wpp.generated.object.CovidHelloReport;
import com.withings.comm.wpp.generated.object.CovidStatusAtRisk;
import com.withings.comm.wpp.generated.object.CustoScreenMetadata;
import com.withings.comm.wpp.generated.object.CustomizationIdGet;
import com.withings.comm.wpp.generated.object.CustomizationIdSet;
import com.withings.comm.wpp.generated.object.CycleTrackingCycle;
import com.withings.comm.wpp.generated.object.CycleTrackingMenstruationStart;
import com.withings.comm.wpp.generated.object.Dac;
import com.withings.comm.wpp.generated.object.DblibDump;
import com.withings.comm.wpp.generated.object.DebugDumpAnchor;
import com.withings.comm.wpp.generated.object.DebugDumpData;
import com.withings.comm.wpp.generated.object.DebugDumpFormat;
import com.withings.comm.wpp.generated.object.DebugDumpIgnoreData;
import com.withings.comm.wpp.generated.object.DebugDumpMask;
import com.withings.comm.wpp.generated.object.DebugDumpType;
import com.withings.comm.wpp.generated.object.DemoStart;
import com.withings.comm.wpp.generated.object.DeviceChallengeReply;
import com.withings.comm.wpp.generated.object.DeviceChallengeRequest;
import com.withings.comm.wpp.generated.object.DeviceChallengeSignature;
import com.withings.comm.wpp.generated.object.DeviceState;
import com.withings.comm.wpp.generated.object.DigitalCrownMotionDelta;
import com.withings.comm.wpp.generated.object.DigitalCrownResolutionParams;
import com.withings.comm.wpp.generated.object.DigitalCrownScaleFactor;
import com.withings.comm.wpp.generated.object.DispBehavior0;
import com.withings.comm.wpp.generated.object.DispPrefs0;
import com.withings.comm.wpp.generated.object.Distance;
import com.withings.comm.wpp.generated.object.Dump;
import com.withings.comm.wpp.generated.object.Duration;
import com.withings.comm.wpp.generated.object.EcgWaveItvl;
import com.withings.comm.wpp.generated.object.EndTime;
import com.withings.comm.wpp.generated.object.EventV1Deprecated;
import com.withings.comm.wpp.generated.object.EventV2;
import com.withings.comm.wpp.generated.object.FaceMode;
import com.withings.comm.wpp.generated.object.FactoryMode;
import com.withings.comm.wpp.generated.object.FactoryResetMode;
import com.withings.comm.wpp.generated.object.FactoryState;
import com.withings.comm.wpp.generated.object.FactoryTestDsc;
import com.withings.comm.wpp.generated.object.FeatureMask;
import com.withings.comm.wpp.generated.object.FeatureTags;
import com.withings.comm.wpp.generated.object.FirmwareVersion;
import com.withings.comm.wpp.generated.object.FluxSensorMeasureResult;
import com.withings.comm.wpp.generated.object.FwChunk;
import com.withings.comm.wpp.generated.object.FwChunkCrc;
import com.withings.comm.wpp.generated.object.FwChunkRequest;
import com.withings.comm.wpp.generated.object.FwInfo;
import com.withings.comm.wpp.generated.object.GlanceStatus;
import com.withings.comm.wpp.generated.object.GlyphId;
import com.withings.comm.wpp.generated.object.Gpio;
import com.withings.comm.wpp.generated.object.GreentegSensitivityBin;
import com.withings.comm.wpp.generated.object.HandsMove;
import com.withings.comm.wpp.generated.object.Heartrate;
import com.withings.comm.wpp.generated.object.Hmac;
import com.withings.comm.wpp.generated.object.HomeScreen;
import com.withings.comm.wpp.generated.object.HrAs7000;
import com.withings.comm.wpp.generated.object.HrAs7000Status;
import com.withings.comm.wpp.generated.object.HrAs7000Stop;
import com.withings.comm.wpp.generated.object.HrAutoAlgo;
import com.withings.comm.wpp.generated.object.IapWci;
import com.withings.comm.wpp.generated.object.Id;
import com.withings.comm.wpp.generated.object.Ifsettings;
import com.withings.comm.wpp.generated.object.Ifstate;
import com.withings.comm.wpp.generated.object.ImageData;
import com.withings.comm.wpp.generated.object.ImageMetadata;
import com.withings.comm.wpp.generated.object.InactivityCfg;
import com.withings.comm.wpp.generated.object.InfoType;
import com.withings.comm.wpp.generated.object.Int32;
import com.withings.comm.wpp.generated.object.Ip;
import com.withings.comm.wpp.generated.object.IpSettings;
import com.withings.comm.wpp.generated.object.IsCartridgeInserted;
import com.withings.comm.wpp.generated.object.IsHoodOpened;
import com.withings.comm.wpp.generated.object.Key;
import com.withings.comm.wpp.generated.object.LampState;
import com.withings.comm.wpp.generated.object.LapNb;
import com.withings.comm.wpp.generated.object.Lcd;
import com.withings.comm.wpp.generated.object.LightSensorReply;
import com.withings.comm.wpp.generated.object.LiveHr;
import com.withings.comm.wpp.generated.object.LocalNotification;
import com.withings.comm.wpp.generated.object.LocaleSet;
import com.withings.comm.wpp.generated.object.LuminosityLevel;
import com.withings.comm.wpp.generated.object.Mac;
import com.withings.comm.wpp.generated.object.MacBytes;
import com.withings.comm.wpp.generated.object.Max8614xChannelConfig;
import com.withings.comm.wpp.generated.object.Max8614xChannelStats;
import com.withings.comm.wpp.generated.object.Max8614xFactoryStats;
import com.withings.comm.wpp.generated.object.Max8614xFactoryStatsParams;
import com.withings.comm.wpp.generated.object.Max8614xR;
import com.withings.comm.wpp.generated.object.Max86173ChannelStats;
import com.withings.comm.wpp.generated.object.Max8617xChannelStats;
import com.withings.comm.wpp.generated.object.Mcp3422MeasureResult;
import com.withings.comm.wpp.generated.object.McuId;
import com.withings.comm.wpp.generated.object.MeasureCategory;
import com.withings.comm.wpp.generated.object.MeasureLiveAppStatus;
import com.withings.comm.wpp.generated.object.MeasureLiveEcg;
import com.withings.comm.wpp.generated.object.MeasureLiveMeta;
import com.withings.comm.wpp.generated.object.MeasureProcessStep;
import com.withings.comm.wpp.generated.object.MeasureStopReason;
import com.withings.comm.wpp.generated.object.MoveHands;
import com.withings.comm.wpp.generated.object.MtuAttBle;
import com.withings.comm.wpp.generated.object.MtuTls;
import com.withings.comm.wpp.generated.object.MtuWpp;
import com.withings.comm.wpp.generated.object.Name;
import com.withings.comm.wpp.generated.object.NbAlarm;
import com.withings.comm.wpp.generated.object.NetupdateProgress;
import com.withings.comm.wpp.generated.object.NetupdateResult;
import com.withings.comm.wpp.generated.object.No2Cal;
import com.withings.comm.wpp.generated.object.No2CalMeasure;
import com.withings.comm.wpp.generated.object.NotificationAppDisplayInfo;
import com.withings.comm.wpp.generated.object.NotificationAppHashIdCrc32;
import com.withings.comm.wpp.generated.object.NotificationAppHashIdVersion;
import com.withings.comm.wpp.generated.object.NotificationAppId;
import com.withings.comm.wpp.generated.object.NotificationAppInfo;
import com.withings.comm.wpp.generated.object.NotificationsDisplayState;
import com.withings.comm.wpp.generated.object.Null;
import com.withings.comm.wpp.generated.object.Pace;
import com.withings.comm.wpp.generated.object.PauseState;
import com.withings.comm.wpp.generated.object.Percentile;
import com.withings.comm.wpp.generated.object.Perso;
import com.withings.comm.wpp.generated.object.PlsReturnCode;
import com.withings.comm.wpp.generated.object.PlsStation;
import com.withings.comm.wpp.generated.object.PressureTemperature;
import com.withings.comm.wpp.generated.object.ProbeChallenge;
import com.withings.comm.wpp.generated.object.ProbeChallengeResponse;
import com.withings.comm.wpp.generated.object.ProbeReply;
import com.withings.comm.wpp.generated.object.ProgramSetting;
import com.withings.comm.wpp.generated.object.ProgramType;
import com.withings.comm.wpp.generated.object.RawDataCmd;
import com.withings.comm.wpp.generated.object.RawDataReadMode;
import com.withings.comm.wpp.generated.object.RawDataStreamControl;
import com.withings.comm.wpp.generated.object.RebootOptional;
import com.withings.comm.wpp.generated.object.RebootReason;
import com.withings.comm.wpp.generated.object.ResponsiveLightMode;
import com.withings.comm.wpp.generated.object.ReturnCode;
import com.withings.comm.wpp.generated.object.RhTemp;
import com.withings.comm.wpp.generated.object.Rtc;
import com.withings.comm.wpp.generated.object.ScaleMedappUserInfo;
import com.withings.comm.wpp.generated.object.ScaleSession;
import com.withings.comm.wpp.generated.object.ScreenList;
import com.withings.comm.wpp.generated.object.ScreenState;
import com.withings.comm.wpp.generated.object.Selftest;
import com.withings.comm.wpp.generated.object.SendEnvMeas;
import com.withings.comm.wpp.generated.object.SensorId;
import com.withings.comm.wpp.generated.object.SetClockMode;
import com.withings.comm.wpp.generated.object.SetTime;
import com.withings.comm.wpp.generated.object.SettingsChanged;
import com.withings.comm.wpp.generated.object.ShortcutAction;
import com.withings.comm.wpp.generated.object.Shortid;
import com.withings.comm.wpp.generated.object.SignalData;
import com.withings.comm.wpp.generated.object.SignalHeader;
import com.withings.comm.wpp.generated.object.SignalType;
import com.withings.comm.wpp.generated.object.Silent;
import com.withings.comm.wpp.generated.object.SkinTemperatureMeasureResult;
import com.withings.comm.wpp.generated.object.SleepActivity;
import com.withings.comm.wpp.generated.object.SleepActivityGet;
import com.withings.comm.wpp.generated.object.Slot;
import com.withings.comm.wpp.generated.object.Sn19020x6MeasureResult;
import com.withings.comm.wpp.generated.object.SoftdeviceVersion;
import com.withings.comm.wpp.generated.object.Speed;
import com.withings.comm.wpp.generated.object.SpiFlashChunk;
import com.withings.comm.wpp.generated.object.SpiFlashCmd;
import com.withings.comm.wpp.generated.object.Spiflash;
import com.withings.comm.wpp.generated.object.Stairs;
import com.withings.comm.wpp.generated.object.StartTime;
import com.withings.comm.wpp.generated.object.Status;
import com.withings.comm.wpp.generated.object.StatusChanged;
import com.withings.comm.wpp.generated.object.Steps;
import com.withings.comm.wpp.generated.object.StoredMeasureAction;
import com.withings.comm.wpp.generated.object.StoredMeasureData;
import com.withings.comm.wpp.generated.object.StoredMeasureDataExtendPos;
import com.withings.comm.wpp.generated.object.StoredMeasureMeta;
import com.withings.comm.wpp.generated.object.StoredMeasureMetaExtend;
import com.withings.comm.wpp.generated.object.StoredMeasureStatus;
import com.withings.comm.wpp.generated.object.StoredSignalData;
import com.withings.comm.wpp.generated.object.StoredSignalMeta;
import com.withings.comm.wpp.generated.object.StoredSignalMetaExtend;
import com.withings.comm.wpp.generated.object.StripCount;
import com.withings.comm.wpp.generated.object.SwimPoolSize;
import com.withings.comm.wpp.generated.object.SwimStatus;
import com.withings.comm.wpp.generated.object.SymptomListItem;
import com.withings.comm.wpp.generated.object.SymptomType;
import com.withings.comm.wpp.generated.object.SyncRequest;
import com.withings.comm.wpp.generated.object.TappingStatus;
import com.withings.comm.wpp.generated.object.TempCalReply;
import com.withings.comm.wpp.generated.object.TempCalSet;
import com.withings.comm.wpp.generated.object.TestScreen;
import com.withings.comm.wpp.generated.object.Threshold;
import com.withings.comm.wpp.generated.object.TimeCounters;
import com.withings.comm.wpp.generated.object.TimeSet;
import com.withings.comm.wpp.generated.object.TimeSetReply;
import com.withings.comm.wpp.generated.object.Timestamp;
import com.withings.comm.wpp.generated.object.Tmp117MeasureResult;
import com.withings.comm.wpp.generated.object.TrackerGoal;
import com.withings.comm.wpp.generated.object.TrackerHistory;
import com.withings.comm.wpp.generated.object.TrackerUser;
import com.withings.comm.wpp.generated.object.TrackerWearPos;
import com.withings.comm.wpp.generated.object.Udi;
import com.withings.comm.wpp.generated.object.Uint32;
import com.withings.comm.wpp.generated.object.Uint64;
import com.withings.comm.wpp.generated.object.UnitConversionParameters;
import com.withings.comm.wpp.generated.object.UnknownSteps;
import com.withings.comm.wpp.generated.object.UpdateFirmware;
import com.withings.comm.wpp.generated.object.UserAction;
import com.withings.comm.wpp.generated.object.UserInfo;
import com.withings.comm.wpp.generated.object.UserSecret;
import com.withings.comm.wpp.generated.object.UserUnit;
import com.withings.comm.wpp.generated.object.VasistasActiRecoV1V2;
import com.withings.comm.wpp.generated.object.VasistasActivityStatus;
import com.withings.comm.wpp.generated.object.VasistasAhi;
import com.withings.comm.wpp.generated.object.VasistasCbt;
import com.withings.comm.wpp.generated.object.VasistasFlags;
import com.withings.comm.wpp.generated.object.VasistasHeartrate;
import com.withings.comm.wpp.generated.object.VasistasSpo2;
import com.withings.comm.wpp.generated.object.VasistasSwimType;
import com.withings.comm.wpp.generated.object.VasistasSwimV1;
import com.withings.comm.wpp.generated.object.VasistasType;
import com.withings.comm.wpp.generated.object.VasistasUncertainSwim;
import com.withings.comm.wpp.generated.object.VasistasWristHr;
import com.withings.comm.wpp.generated.object.VasistasWristTemp;
import com.withings.comm.wpp.generated.object.Version;
import com.withings.comm.wpp.generated.object.VibratorPattern;
import com.withings.comm.wpp.generated.object.VibratorSetSimple;
import com.withings.comm.wpp.generated.object.WamAutoSleep;
import com.withings.comm.wpp.generated.object.WamDailyActivities;
import com.withings.comm.wpp.generated.object.WamDisplayedInfo;
import com.withings.comm.wpp.generated.object.WamRawData;
import com.withings.comm.wpp.generated.object.WamScreensList;
import com.withings.comm.wpp.generated.object.WamVasistasAwake;
import com.withings.comm.wpp.generated.object.WamVasistasDuration;
import com.withings.comm.wpp.generated.object.WamVasistasGet;
import com.withings.comm.wpp.generated.object.WamVasistasHead;
import com.withings.comm.wpp.generated.object.WamVasistasMetCal;
import com.withings.comm.wpp.generated.object.WamVasistasMetCalEarned;
import com.withings.comm.wpp.generated.object.WamVasistasRun;
import com.withings.comm.wpp.generated.object.WamVasistasSleep;
import com.withings.comm.wpp.generated.object.WamVasistasSleepDbg;
import com.withings.comm.wpp.generated.object.WamVasistasWalk;
import com.withings.comm.wpp.generated.object.WeightCal;
import com.withings.comm.wpp.generated.object.WeightVerif;
import com.withings.comm.wpp.generated.object.Weighttest;
import com.withings.comm.wpp.generated.object.WifiAnt;
import com.withings.comm.wpp.generated.object.WifiApConnect;
import com.withings.comm.wpp.generated.object.WifiApScan;
import com.withings.comm.wpp.generated.object.WifiConnectResult;
import com.withings.comm.wpp.generated.object.WifiCountry;
import com.withings.comm.wpp.generated.object.WifiEnable;
import com.withings.comm.wpp.generated.object.WifiScanParam;
import com.withings.comm.wpp.generated.object.Wifidelay;
import com.withings.comm.wpp.generated.object.Wl;
import com.withings.comm.wpp.generated.object.WorkoutGpsStatus;
import com.withings.comm.wpp.generated.object.WorkoutLapState;
import com.withings.comm.wpp.generated.object.WorkoutMaxNumber;
import com.withings.comm.wpp.generated.object.WorkoutScreenGlyphData;
import com.withings.comm.wpp.generated.object.WorkoutScreenList;
import com.withings.comm.wpp.generated.object.WorkoutScreenMetadata;
import com.withings.comm.wpp.generated.object.WorkoutScreenName;
import com.withings.comm.wpp.generated.object.WorkoutTotalDiff;
import com.withings.comm.wpp.generated.object.Wpakey;
import com.withings.comm.wpp.generated.object.WpmBpPulse;
import com.withings.comm.wpp.generated.object.WpmEvent;
import com.withings.comm.wpp.generated.object.WpmGetPressure;
import com.withings.comm.wpp.generated.object.WpmGetzero;
import com.withings.comm.wpp.generated.object.WpmPressure;
import com.withings.comm.wpp.generated.object.WpmResult;
import com.withings.comm.wpp.generated.object.WpmSetMode;
import com.withings.comm.wpp.generated.object.WpmSetMotor;
import com.withings.comm.wpp.generated.object.WpmSetValve;
import com.withings.comm.wpp.generated.object.WpmStart;
import com.withings.comm.wpp.generated.object.WppEvtSupport;
import com.withings.comm.wpp.generated.object.WppString;
import com.withings.comm.wpp.generated.object.WsdAlarm;
import com.withings.comm.wpp.generated.object.WsdProgramId;
import com.withings.comm.wpp.generated.object.WsdProgramInfo;
import com.withings.comm.wpp.generated.object.WsdProgramSettings;
import com.withings.comm.wpp.generated.object.WsdScanWsmFinish;
import com.withings.comm.wpp.generated.object.WsdScanWsmResult;
import com.withings.comm.wpp.generated.object.WsdSetWsmUserResult;
import com.withings.comm.wpp.generated.object.WsdStatus;
import com.withings.comm.wpp.generated.object.WsdSubprogram;
import com.withings.comm.wpp.generated.object.WsdSubstatus;
import com.withings.comm.wpp.generated.object.WsdWsmUser;
import com.withings.comm.wpp.generated.object.WsmLedControl;
import com.withings.comm.wpp.generated.object.WsmMode;
import com.withings.comm.wpp.generated.object.WsmMotor;
import com.withings.comm.wpp.generated.object.WsmPressureMvtGet;
import com.withings.comm.wpp.generated.object.WsmPrivateMode;
import com.withings.comm.wpp.generated.object.WsmRawDataGet;
import com.withings.comm.wpp.generated.object.WsmUser;
import com.withings.comm.wpp.generated.object.WsmValve;
import com.withings.comm.wpp.generated.object.WsmVasistasGeneral;
import com.withings.comm.wpp.generated.object.WsmVasistasGeneralV2;
import com.withings.comm.wpp.generated.object.WsmVasistasGet;
import com.withings.comm.wpp.generated.object.WsmZeroGet;
import com.withings.comm.wpp.generated.object.Zmeter;
import com.withings.comm.wpp.generated.object.ZmeterCal;
import com.withings.library.authentication.api.ConstantsWs;
import java.nio.ByteBuffer;
import java.util.ArrayList;
/* compiled from: WppSerializer.java */
/* loaded from: classes3.dex */
public final class i {
    public static f a(byte[] bArr) {
        h statusChanged;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        byte b10 = wrap.get();
        short s11 = wrap.getShort();
        short s12 = (short) (wrap.getShort() & 65535);
        ArrayList arrayList = new ArrayList();
        while (wrap.remaining() > 2 && wrap.position() - 5 < s12) {
            short s13 = wrap.getShort();
            if (s13 != Short.MIN_VALUE) {
                if (s13 != -32767) {
                    if (s13 != 1040) {
                        if (s13 != 1041) {
                            if (s13 != 1888) {
                                if (s13 != 1889) {
                                    switch (s13) {
                                        case 256:
                                            statusChanged = new Null();
                                            break;
                                        case ConstantsWs.WS_STATUS_ALREADYACTIVATED /* 257 */:
                                            statusChanged = new ProbeReply();
                                            break;
                                        case ConstantsWs.WS_STATUS_WRONGMAINTDATA /* 258 */:
                                            statusChanged = new WifiScanParam();
                                            break;
                                        case ConstantsWs.WS_STATUS_TOOMANYASSOCIATIONS /* 259 */:
                                            statusChanged = new WifiApScan();
                                            break;
                                        case ConstantsWs.WS_STATUS_WRONGDEVTYPE /* 260 */:
                                            statusChanged = new WifiApConnect();
                                            break;
                                        case ConstantsWs.WS_STATUS_NOPRIMARYUSER /* 261 */:
                                            statusChanged = new IpSettings();
                                            break;
                                        case ConstantsWs.WS_STATUS_USERISPRIMARY /* 262 */:
                                            statusChanged = new WifiConnectResult();
                                            break;
                                        case ConstantsWs.WS_STATUS_WRONGSESSIONTYPE /* 263 */:
                                            statusChanged = new BatteryPercent();
                                            break;
                                        case ConstantsWs.WS_STATUS_WRONGEMAIL /* 264 */:
                                            statusChanged = new WifiCountry();
                                            break;
                                        case ConstantsWs.WS_STATUS_TOOBIG /* 265 */:
                                            statusChanged = new Ip();
                                            break;
                                        case ConstantsWs.WS_STATUS_WRONGSECRET /* 266 */:
                                            statusChanged = new Bssid();
                                            break;
                                        case ConstantsWs.WS_STATUS_WRONGFW /* 267 */:
                                            statusChanged = new Wpakey();
                                            break;
                                        case ConstantsWs.WS_STATUS_ACCOUNTACTIVATIONERROR /* 268 */:
                                            statusChanged = new Wifidelay();
                                            break;
                                        case ConstantsWs.WS_STATUS_USERCREATEERROR /* 269 */:
                                            statusChanged = new Ifsettings();
                                            break;
                                        case ConstantsWs.WS_STATUS_USERUPDATEERROR /* 270 */:
                                            statusChanged = new WifiEnable();
                                            break;
                                        case ConstantsWs.WS_STATUS_WRONGBLINDCODE /* 271 */:
                                            statusChanged = new Ifstate();
                                            break;
                                        case 272:
                                            statusChanged = new Cmderror();
                                            break;
                                        case ConstantsWs.WS_STATUS_NOPWDUPDATECODE /* 273 */:
                                            statusChanged = new ConnectResultExt();
                                            break;
                                        case ConstantsWs.WS_STATUS_MEASNOTSHARED /* 274 */:
                                            statusChanged = new ScaleSession();
                                            break;
                                        default:
                                            if (s13 != 2066) {
                                                if (s13 != 2067) {
                                                    switch (s13) {
                                                        case ConstantsWs.WS_STATUS_WRONGASSOCNAME /* 276 */:
                                                            statusChanged = new StoredMeasureAction();
                                                            break;
                                                        case ConstantsWs.WS_STATUS_UNAUTHORIZED /* 277 */:
                                                            statusChanged = new StoredMeasureStatus();
                                                            break;
                                                        case ConstantsWs.WS_STATUS_FILEERROR /* 278 */:
                                                            statusChanged = new StoredMeasureMeta();
                                                            break;
                                                        case ConstantsWs.WS_STATUS_NOHEIGHT /* 279 */:
                                                            statusChanged = new StoredMeasureData();
                                                            break;
                                                        case ConstantsWs.WS_STATUS_ACCOUNTUPDATEERROR /* 280 */:
                                                            statusChanged = new ConnectReason();
                                                            break;
                                                        case ConstantsWs.WS_STATUS_MEASUPDATEERROR /* 281 */:
                                                            statusChanged = new UserUnit();
                                                            break;
                                                        case ConstantsWs.WS_STATUS_ASSOCUPDATEERROR /* 282 */:
                                                            statusChanged = new UserInfo();
                                                            break;
                                                        case ConstantsWs.WS_STATUS_WRONGTOKEN /* 283 */:
                                                            statusChanged = new DblibDump();
                                                            break;
                                                        case ConstantsWs.WS_STATUS_WRONGAPPLI /* 284 */:
                                                            statusChanged = new AssocToken();
                                                            break;
                                                        case ConstantsWs.WS_STATUS_WRONGVERSION /* 285 */:
                                                            statusChanged = new DebugDumpData();
                                                            break;
                                                        case ConstantsWs.WS_STATUS_WRONGRELATION /* 286 */:
                                                            statusChanged = new DebugDumpMask();
                                                            break;
                                                        case ConstantsWs.WS_STATUS_WRONGAPPLICATIONTYPE /* 287 */:
                                                            statusChanged = new DebugDumpType();
                                                            break;
                                                        case ConstantsWs.WS_STATUS_WRONGAPPLICATIONCTX /* 288 */:
                                                            statusChanged = new CommSupport();
                                                            break;
                                                        case ConstantsWs.WS_STATUS_TOOMANYSHARINGS /* 289 */:
                                                            statusChanged = new LocaleSet();
                                                            break;
                                                        case ConstantsWs.WS_STATUS_WRONGCONTEXT /* 290 */:
                                                            statusChanged = new ProbeChallenge();
                                                            break;
                                                        case ConstantsWs.WS_STATUS_IPUSHERROR /* 291 */:
                                                            statusChanged = new ProbeChallengeResponse();
                                                            break;
                                                        case ConstantsWs.WS_STATUS_TWITTERROR /* 292 */:
                                                            statusChanged = new BatteryVoltageMv();
                                                            break;
                                                        case ConstantsWs.WS_STATUS_WRONGURL /* 293 */:
                                                            statusChanged = new DebugDumpIgnoreData();
                                                            break;
                                                        case ConstantsWs.WS_STATUS_NOSUBSCRIPTION /* 294 */:
                                                            statusChanged = new AlarmId();
                                                            break;
                                                        case ConstantsWs.WS_STATUS_WRONGPUBLICKEY /* 295 */:
                                                            statusChanged = new NbAlarm();
                                                            break;
                                                        case ConstantsWs.WS_STATUS_TOOMANYPUBLICKEYS /* 296 */:
                                                            statusChanged = new PlsReturnCode();
                                                            break;
                                                        case ConstantsWs.WS_STATUS_WRONGCONSUMER /* 297 */:
                                                            statusChanged = new PlsStation();
                                                            break;
                                                        case ConstantsWs.WS_STATUS_PUSHERROR /* 298 */:
                                                            statusChanged = new AppProbe();
                                                            break;
                                                        case ConstantsWs.WS_STATUS_PHONEACCOUNTNOTFOUND /* 299 */:
                                                            statusChanged = new StoredMeasureMetaExtend();
                                                            break;
                                                        case 300:
                                                            statusChanged = new FactoryState();
                                                            break;
                                                        case 301:
                                                            statusChanged = new DebugDumpFormat();
                                                            break;
                                                        case 302:
                                                            statusChanged = new FactoryResetMode();
                                                            break;
                                                        case 303:
                                                            statusChanged = new TrackerWearPos();
                                                            break;
                                                        case 304:
                                                            statusChanged = new CaptureSct01();
                                                            break;
                                                        default:
                                                            switch (s13) {
                                                                case 1025:
                                                                    statusChanged = new UpdateFirmware();
                                                                    break;
                                                                case 1043:
                                                                    statusChanged = new Mac();
                                                                    break;
                                                                case 1917:
                                                                    statusChanged = new WpmGetzero();
                                                                    break;
                                                                case 1923:
                                                                    statusChanged = new WpmPressure();
                                                                    break;
                                                                case 2338:
                                                                    statusChanged = new SendEnvMeas();
                                                                    break;
                                                                case 2400:
                                                                    statusChanged = new RawDataStreamControl();
                                                                    break;
                                                                case 2401:
                                                                    statusChanged = new Version();
                                                                    break;
                                                                case 2402:
                                                                    statusChanged = new RawDataReadMode();
                                                                    break;
                                                                case 2403:
                                                                    statusChanged = new NotificationAppInfo();
                                                                    break;
                                                                case 2404:
                                                                    statusChanged = new NotificationAppId();
                                                                    break;
                                                                case 2405:
                                                                    statusChanged = new NotificationAppDisplayInfo();
                                                                    break;
                                                                case 2406:
                                                                    statusChanged = new NotificationAppHashIdVersion();
                                                                    break;
                                                                case 2407:
                                                                    statusChanged = new NotificationAppHashIdCrc32();
                                                                    break;
                                                                case 2408:
                                                                    statusChanged = new CacheType();
                                                                    break;
                                                                case 2409:
                                                                    statusChanged = new ActivitySubcategory();
                                                                    break;
                                                                case 2410:
                                                                    statusChanged = new Timestamp();
                                                                    break;
                                                                case 2411:
                                                                    statusChanged = new Pace();
                                                                    break;
                                                                case 2412:
                                                                    statusChanged = new FaceMode();
                                                                    break;
                                                                case 2413:
                                                                    statusChanged = new Speed();
                                                                    break;
                                                                case 2414:
                                                                    statusChanged = new FwInfo();
                                                                    break;
                                                                case 2415:
                                                                    statusChanged = new FwChunkRequest();
                                                                    break;
                                                                case 2416:
                                                                    statusChanged = new FwChunk();
                                                                    break;
                                                                case 2417:
                                                                    statusChanged = new FwChunkCrc();
                                                                    break;
                                                                case 2418:
                                                                    statusChanged = new StartTime();
                                                                    break;
                                                                case 2419:
                                                                    statusChanged = new EndTime();
                                                                    break;
                                                                case 2420:
                                                                    statusChanged = new Status();
                                                                    break;
                                                                case 2421:
                                                                    statusChanged = new TestScreen();
                                                                    break;
                                                                case 2422:
                                                                    statusChanged = new ChallengeRequest();
                                                                    break;
                                                                case 2423:
                                                                    statusChanged = new BleShellChallenge();
                                                                    break;
                                                                case 2424:
                                                                    statusChanged = new DebugDumpAnchor();
                                                                    break;
                                                                case 2425:
                                                                    statusChanged = new FactoryMode();
                                                                    break;
                                                                case 2426:
                                                                    statusChanged = new GlanceStatus();
                                                                    break;
                                                                case 2427:
                                                                    statusChanged = new MeasureCategory();
                                                                    break;
                                                                case 2428:
                                                                    statusChanged = new MeasureLiveMeta();
                                                                    break;
                                                                case 2429:
                                                                    statusChanged = new MeasureLiveEcg();
                                                                    break;
                                                                case 2430:
                                                                    statusChanged = new MeasureStopReason();
                                                                    break;
                                                                case 2431:
                                                                    statusChanged = new PressureTemperature();
                                                                    break;
                                                                case 2432:
                                                                    statusChanged = new AltimeterCompensation();
                                                                    break;
                                                                case 2433:
                                                                    statusChanged = new Percentile();
                                                                    break;
                                                                case 2434:
                                                                    statusChanged = new BatteryStatusSamples();
                                                                    break;
                                                                case 2435:
                                                                    statusChanged = new MeasureProcessStep();
                                                                    break;
                                                                case 2436:
                                                                    statusChanged = new ActivityLap();
                                                                    break;
                                                                case 2437:
                                                                    statusChanged = new Udi();
                                                                    break;
                                                                case 2438:
                                                                    statusChanged = new ActivityPause();
                                                                    break;
                                                                case 2439:
                                                                    statusChanged = new PauseState();
                                                                    break;
                                                                case 2440:
                                                                    statusChanged = new WorkoutLapState();
                                                                    break;
                                                                case 2441:
                                                                    statusChanged = new WorkoutTotalDiff();
                                                                    break;
                                                                case 2442:
                                                                    statusChanged = new RebootReason();
                                                                    break;
                                                                case 2443:
                                                                    statusChanged = new RebootOptional();
                                                                    break;
                                                                case 2444:
                                                                    statusChanged = new Max8614xFactoryStats();
                                                                    break;
                                                                case 2445:
                                                                    statusChanged = new DigitalCrownMotionDelta();
                                                                    break;
                                                                case 2446:
                                                                    statusChanged = new DigitalCrownResolutionParams();
                                                                    break;
                                                                case 2447:
                                                                    statusChanged = new Max8614xFactoryStatsParams();
                                                                    break;
                                                                case 2448:
                                                                    statusChanged = new MtuWpp();
                                                                    break;
                                                                case 2449:
                                                                    statusChanged = new MtuTls();
                                                                    break;
                                                                case 2450:
                                                                    statusChanged = new MtuAttBle();
                                                                    break;
                                                                case 2451:
                                                                    statusChanged = new StoredMeasureDataExtendPos();
                                                                    break;
                                                                case 2452:
                                                                    statusChanged = new Heartrate();
                                                                    break;
                                                                case 2453:
                                                                    statusChanged = new VasistasSpo2();
                                                                    break;
                                                                case 2455:
                                                                    statusChanged = new Key();
                                                                    break;
                                                                case 2456:
                                                                    statusChanged = new CovidEbidEcc();
                                                                    break;
                                                                case 2457:
                                                                    statusChanged = new CovidStatusAtRisk();
                                                                    break;
                                                                case 2458:
                                                                    statusChanged = new CovidHelloReport();
                                                                    break;
                                                                case 2459:
                                                                    statusChanged = new Hmac();
                                                                    break;
                                                                case 2460:
                                                                    statusChanged = new FeatureTags();
                                                                    break;
                                                                case 2461:
                                                                    statusChanged = new VasistasFlags();
                                                                    break;
                                                                case 2463:
                                                                    statusChanged = new MeasureLiveAppStatus();
                                                                    break;
                                                                case 2464:
                                                                    statusChanged = new VasistasAhi();
                                                                    break;
                                                                case 2465:
                                                                    statusChanged = new ShortcutAction();
                                                                    break;
                                                                case 2467:
                                                                    statusChanged = new BootstrapRedirect();
                                                                    break;
                                                                case 2468:
                                                                    statusChanged = new CertDer();
                                                                    break;
                                                                case 2469:
                                                                    statusChanged = new Threshold();
                                                                    break;
                                                                case 2470:
                                                                    statusChanged = new Shortid();
                                                                    break;
                                                                case 2471:
                                                                    statusChanged = new NotificationsDisplayState();
                                                                    break;
                                                                case 2472:
                                                                    statusChanged = new LocalNotification();
                                                                    break;
                                                                case 2473:
                                                                    statusChanged = new EventV2();
                                                                    break;
                                                                case 2474:
                                                                    statusChanged = new Boolean();
                                                                    break;
                                                                case 2475:
                                                                    statusChanged = new EcgWaveItvl();
                                                                    break;
                                                                case 2476:
                                                                    statusChanged = new BreatheParam();
                                                                    break;
                                                                case 2477:
                                                                    statusChanged = new InactivityCfg();
                                                                    break;
                                                                case 2478:
                                                                    statusChanged = new CartridgeState();
                                                                    break;
                                                                case 2479:
                                                                    statusChanged = new StripCount();
                                                                    break;
                                                                case 2480:
                                                                    statusChanged = new Max8614xChannelStats();
                                                                    break;
                                                                case 2481:
                                                                    statusChanged = new Max8614xChannelConfig();
                                                                    break;
                                                                case 2482:
                                                                    statusChanged = new Max8614xR();
                                                                    break;
                                                                case 2483:
                                                                    statusChanged = new MacBytes();
                                                                    break;
                                                                case 2484:
                                                                    statusChanged = new IsCartridgeInserted();
                                                                    break;
                                                                case 2485:
                                                                    statusChanged = new IsHoodOpened();
                                                                    break;
                                                                case 2486:
                                                                    statusChanged = new Max8617xChannelStats();
                                                                    break;
                                                                case 2487:
                                                                    statusChanged = new Mcp3422MeasureResult();
                                                                    break;
                                                                case 2488:
                                                                    statusChanged = new As6221MeasureResult();
                                                                    break;
                                                                case 2489:
                                                                    statusChanged = new AlgoParam();
                                                                    break;
                                                                case 2490:
                                                                    statusChanged = new Stairs();
                                                                    break;
                                                                case 2491:
                                                                    statusChanged = new MoveHands();
                                                                    break;
                                                                case 2492:
                                                                    statusChanged = new CartridgeExpiryDate();
                                                                    break;
                                                                case 2493:
                                                                    statusChanged = new WorkoutMaxNumber();
                                                                    break;
                                                                case 2494:
                                                                    statusChanged = new Tmp117MeasureResult();
                                                                    break;
                                                                case 2495:
                                                                    statusChanged = new Sn19020x6MeasureResult();
                                                                    break;
                                                                case 2496:
                                                                    statusChanged = new SkinTemperatureMeasureResult();
                                                                    break;
                                                                case 2497:
                                                                    statusChanged = new FluxSensorMeasureResult();
                                                                    break;
                                                                case 2498:
                                                                    statusChanged = new DeviceChallengeRequest();
                                                                    break;
                                                                case 2499:
                                                                    statusChanged = new DeviceChallengeReply();
                                                                    break;
                                                                case 2500:
                                                                    statusChanged = new DeviceChallengeSignature();
                                                                    break;
                                                                case 2501:
                                                                    statusChanged = new FactoryTestDsc();
                                                                    break;
                                                                case 2502:
                                                                    statusChanged = new VasistasCbt();
                                                                    break;
                                                                case 2503:
                                                                    statusChanged = new CleansingModeStart();
                                                                    break;
                                                                case 2504:
                                                                    statusChanged = new CleansingModeStatus();
                                                                    break;
                                                                case 2505:
                                                                    statusChanged = new Max86173ChannelStats();
                                                                    break;
                                                                case 2506:
                                                                    statusChanged = new GreentegSensitivityBin();
                                                                    break;
                                                                case 2507:
                                                                    statusChanged = new DigitalCrownScaleFactor();
                                                                    break;
                                                                case 2508:
                                                                    statusChanged = new SymptomType();
                                                                    break;
                                                                case 2509:
                                                                    statusChanged = new SymptomListItem();
                                                                    break;
                                                                case 2510:
                                                                    statusChanged = new CycleTrackingCycle();
                                                                    break;
                                                                case 2511:
                                                                    statusChanged = new VibratorSetSimple();
                                                                    break;
                                                                case 2512:
                                                                    statusChanged = new CycleTrackingMenstruationStart();
                                                                    break;
                                                                case 2513:
                                                                    statusChanged = new DeviceState();
                                                                    break;
                                                                case 2514:
                                                                    statusChanged = new TrackerHistory();
                                                                    break;
                                                                default:
                                                                    switch (s13) {
                                                                        case 1892:
                                                                            statusChanged = new WpmResult();
                                                                            break;
                                                                        case 1893:
                                                                            statusChanged = new WpmBpPulse();
                                                                            break;
                                                                        case 1894:
                                                                            statusChanged = new WpmEvent();
                                                                            break;
                                                                        default:
                                                                            switch (s13) {
                                                                                case 1911:
                                                                                    statusChanged = new WpmSetValve();
                                                                                    break;
                                                                                case 1912:
                                                                                    statusChanged = new WpmSetMotor();
                                                                                    break;
                                                                                case 1913:
                                                                                    statusChanged = new WpmGetPressure();
                                                                                    break;
                                                                                default:
                                                                                    switch (s13) {
                                                                                        case ModuleCopy.f28574b /* 2048 */:
                                                                                            statusChanged = new WsmMode();
                                                                                            break;
                                                                                        case 2049:
                                                                                            statusChanged = new WsmValve();
                                                                                            break;
                                                                                        case 2050:
                                                                                            statusChanged = new WsmMotor();
                                                                                            break;
                                                                                        case 2051:
                                                                                            statusChanged = new WsmPressureMvtGet();
                                                                                            break;
                                                                                        case 2052:
                                                                                            statusChanged = new WsmZeroGet();
                                                                                            break;
                                                                                        default:
                                                                                            switch (s13) {
                                                                                                case 2055:
                                                                                                    statusChanged = new WsmUser();
                                                                                                    break;
                                                                                                case 2056:
                                                                                                    statusChanged = new WsmVasistasGet();
                                                                                                    break;
                                                                                                case 2057:
                                                                                                    statusChanged = new WsmRawDataGet();
                                                                                                    break;
                                                                                                case 2058:
                                                                                                    statusChanged = new WsmLedControl();
                                                                                                    break;
                                                                                                case 2059:
                                                                                                    statusChanged = new WsmPrivateMode();
                                                                                                    break;
                                                                                                default:
                                                                                                    switch (s13) {
                                                                                                        case 2305:
                                                                                                            statusChanged = new WsdScanWsmResult();
                                                                                                            break;
                                                                                                        case 2306:
                                                                                                            statusChanged = new WsdScanWsmFinish();
                                                                                                            break;
                                                                                                        case 2307:
                                                                                                            statusChanged = new WsdWsmUser();
                                                                                                            break;
                                                                                                        case 2308:
                                                                                                            statusChanged = new WsdAlarm();
                                                                                                            break;
                                                                                                        case 2309:
                                                                                                            statusChanged = new WsdSetWsmUserResult();
                                                                                                            break;
                                                                                                        case 2310:
                                                                                                            statusChanged = new WsdProgramSettings();
                                                                                                            break;
                                                                                                        case 2311:
                                                                                                            statusChanged = new WsdStatus();
                                                                                                            break;
                                                                                                        case 2312:
                                                                                                            statusChanged = new WsdProgramId();
                                                                                                            break;
                                                                                                        case 2313:
                                                                                                            statusChanged = new WsdProgramInfo();
                                                                                                            break;
                                                                                                        case 2314:
                                                                                                            statusChanged = new SetClockMode();
                                                                                                            break;
                                                                                                        case 2315:
                                                                                                            statusChanged = new Color();
                                                                                                            break;
                                                                                                        case 2316:
                                                                                                            statusChanged = new LampState();
                                                                                                            break;
                                                                                                        case 2317:
                                                                                                            statusChanged = new ClockDisplaySetting();
                                                                                                            break;
                                                                                                        case 2318:
                                                                                                            statusChanged = new BleLinkStatus();
                                                                                                            break;
                                                                                                        case 2319:
                                                                                                            statusChanged = new WsdSubstatus();
                                                                                                            break;
                                                                                                        case 2320:
                                                                                                            statusChanged = new WppEvtSupport();
                                                                                                            break;
                                                                                                        case 2321:
                                                                                                            statusChanged = new SwimPoolSize();
                                                                                                            break;
                                                                                                        case 2322:
                                                                                                            statusChanged = new ColorHsl();
                                                                                                            break;
                                                                                                        case 2323:
                                                                                                            statusChanged = new ColorHsv();
                                                                                                            break;
                                                                                                        case 2324:
                                                                                                            statusChanged = new ColorRgb();
                                                                                                            break;
                                                                                                        case 2325:
                                                                                                            statusChanged = new ResponsiveLightMode();
                                                                                                            break;
                                                                                                        case 2326:
                                                                                                            statusChanged = new ProgramSetting();
                                                                                                            break;
                                                                                                        case 2327:
                                                                                                            statusChanged = new ProgramType();
                                                                                                            break;
                                                                                                        case 2328:
                                                                                                            statusChanged = new ReturnCode();
                                                                                                            break;
                                                                                                        case 2329:
                                                                                                            statusChanged = new AlarmEnabled();
                                                                                                            break;
                                                                                                        case 2330:
                                                                                                            statusChanged = new TappingStatus();
                                                                                                            break;
                                                                                                        case 2331:
                                                                                                            statusChanged = new SwimStatus();
                                                                                                            break;
                                                                                                        case 2332:
                                                                                                            statusChanged = new CalibrationSession();
                                                                                                            break;
                                                                                                        case 2333:
                                                                                                            statusChanged = new WsdSubprogram();
                                                                                                            break;
                                                                                                        default:
                                                                                                            switch (s13) {
                                                                                                                case 2340:
                                                                                                                    statusChanged = new DispPrefs0();
                                                                                                                    break;
                                                                                                                case 2341:
                                                                                                                    statusChanged = new DispBehavior0();
                                                                                                                    break;
                                                                                                                case 2342:
                                                                                                                    statusChanged = new HrAs7000Stop();
                                                                                                                    break;
                                                                                                                case 2343:
                                                                                                                    statusChanged = new HrAs7000();
                                                                                                                    break;
                                                                                                                case 2344:
                                                                                                                    statusChanged = new AppProbeOsVersion();
                                                                                                                    break;
                                                                                                                case 2345:
                                                                                                                    statusChanged = new VasistasHeartrate();
                                                                                                                    break;
                                                                                                                case 2346:
                                                                                                                    statusChanged = new AncsStatus();
                                                                                                                    break;
                                                                                                                case 2347:
                                                                                                                    statusChanged = new AncsConfig();
                                                                                                                    break;
                                                                                                                case 2348:
                                                                                                                    statusChanged = new VasistasActivityStatus();
                                                                                                                    break;
                                                                                                                case 2349:
                                                                                                                    statusChanged = new TempCalSet();
                                                                                                                    break;
                                                                                                                case 2350:
                                                                                                                    statusChanged = new TempCalReply();
                                                                                                                    break;
                                                                                                                case 2351:
                                                                                                                    statusChanged = new CalibrationType();
                                                                                                                    break;
                                                                                                                case 2352:
                                                                                                                    statusChanged = new CalibrationPoint();
                                                                                                                    break;
                                                                                                                case 2353:
                                                                                                                    statusChanged = new VasistasWristHr();
                                                                                                                    break;
                                                                                                                case 2354:
                                                                                                                    statusChanged = new VasistasWristTemp();
                                                                                                                    break;
                                                                                                                case 2355:
                                                                                                                    statusChanged = new HomeScreen();
                                                                                                                    break;
                                                                                                                case 2356:
                                                                                                                    statusChanged = new LightSensorReply();
                                                                                                                    break;
                                                                                                                case 2357:
                                                                                                                    statusChanged = new CustomizationIdGet();
                                                                                                                    break;
                                                                                                                case 2358:
                                                                                                                    statusChanged = new CustomizationIdSet();
                                                                                                                    break;
                                                                                                                case 2359:
                                                                                                                    statusChanged = new LuminosityLevel();
                                                                                                                    break;
                                                                                                                case 2360:
                                                                                                                    statusChanged = new AnsStatus();
                                                                                                                    break;
                                                                                                                case 2361:
                                                                                                                    statusChanged = new AnsConfig();
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    switch (s13) {
                                                                                                                        case 2368:
                                                                                                                            statusChanged = new UserAction();
                                                                                                                            break;
                                                                                                                        case 2369:
                                                                                                                            statusChanged = new LiveHr();
                                                                                                                            break;
                                                                                                                        case 2370:
                                                                                                                            statusChanged = new UnknownSteps();
                                                                                                                            break;
                                                                                                                        case 2371:
                                                                                                                            statusChanged = new TimeCounters();
                                                                                                                            break;
                                                                                                                        case 2372:
                                                                                                                            statusChanged = new SpiFlashCmd();
                                                                                                                            break;
                                                                                                                        case 2373:
                                                                                                                            statusChanged = new SpiFlashChunk();
                                                                                                                            break;
                                                                                                                        case 2374:
                                                                                                                            statusChanged = new VibratorPattern();
                                                                                                                            break;
                                                                                                                        case 2375:
                                                                                                                            statusChanged = new HrAs7000Status();
                                                                                                                            break;
                                                                                                                        case 2376:
                                                                                                                            statusChanged = new SleepActivityGet();
                                                                                                                            break;
                                                                                                                        case 2377:
                                                                                                                            statusChanged = new SleepActivity();
                                                                                                                            break;
                                                                                                                        case 2378:
                                                                                                                            statusChanged = new EventV1Deprecated();
                                                                                                                            break;
                                                                                                                        case 2379:
                                                                                                                            statusChanged = new SignalType();
                                                                                                                            break;
                                                                                                                        case 2380:
                                                                                                                            statusChanged = new SignalHeader();
                                                                                                                            break;
                                                                                                                        case 2381:
                                                                                                                            statusChanged = new CborData();
                                                                                                                            break;
                                                                                                                        case 2382:
                                                                                                                            statusChanged = new AmazonAuth();
                                                                                                                            break;
                                                                                                                        case 2383:
                                                                                                                            statusChanged = new No2Cal();
                                                                                                                            break;
                                                                                                                        case 2384:
                                                                                                                            statusChanged = new AmazonCodeChallenge();
                                                                                                                            break;
                                                                                                                        case 2385:
                                                                                                                            statusChanged = new No2CalMeasure();
                                                                                                                            break;
                                                                                                                        case 2386:
                                                                                                                            statusChanged = new SignalData();
                                                                                                                            break;
                                                                                                                        case 2387:
                                                                                                                            statusChanged = new LapNb();
                                                                                                                            break;
                                                                                                                        case 2388:
                                                                                                                            statusChanged = new BatteryStateOpt();
                                                                                                                            break;
                                                                                                                        case 2389:
                                                                                                                            statusChanged = new ScreenState();
                                                                                                                            break;
                                                                                                                        case 2390:
                                                                                                                            statusChanged = new Steps();
                                                                                                                            break;
                                                                                                                        case 2391:
                                                                                                                            statusChanged = new Calories();
                                                                                                                            break;
                                                                                                                        case 2392:
                                                                                                                            statusChanged = new Distance();
                                                                                                                            break;
                                                                                                                        case 2393:
                                                                                                                            statusChanged = new AcqFreq();
                                                                                                                            break;
                                                                                                                        case 2394:
                                                                                                                            statusChanged = new InfoType();
                                                                                                                            break;
                                                                                                                        case 2395:
                                                                                                                            statusChanged = new Duration();
                                                                                                                            break;
                                                                                                                        case 2396:
                                                                                                                            statusChanged = new GlyphId();
                                                                                                                            break;
                                                                                                                        case 2397:
                                                                                                                            statusChanged = new ImageMetadata();
                                                                                                                            break;
                                                                                                                        case 2398:
                                                                                                                            statusChanged = new ImageData();
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            switch (s13) {
                                                                                                                                case 307:
                                                                                                                                    statusChanged = new FeatureMask();
                                                                                                                                    break;
                                                                                                                                case 308:
                                                                                                                                    statusChanged = new ScaleMedappUserInfo();
                                                                                                                                    break;
                                                                                                                                case ConstantsWs.WS_STATUS_WRONGRESOURCETYPE /* 309 */:
                                                                                                                                    statusChanged = new AccountKey();
                                                                                                                                    break;
                                                                                                                                case ConstantsWs.WS_STATUS_WRONGACLTYPE /* 310 */:
                                                                                                                                    statusChanged = new AdvKey();
                                                                                                                                    break;
                                                                                                                                case ConstantsWs.WS_STATUS_WRONG_G_ADJUST /* 311 */:
                                                                                                                                    statusChanged = new McuId();
                                                                                                                                    break;
                                                                                                                                case ConstantsWs.WS_STATUS_WRONGFILTER /* 312 */:
                                                                                                                                    statusChanged = new SensorId();
                                                                                                                                    break;
                                                                                                                                case ConstantsWs.WS_STATUS_WRONG_SHARINGCLIENTID /* 313 */:
                                                                                                                                    statusChanged = new SoftdeviceVersion();
                                                                                                                                    break;
                                                                                                                                case ConstantsWs.WS_STATUS_WRONG_SHARINGSERVERID /* 314 */:
                                                                                                                                    statusChanged = new HrAutoAlgo();
                                                                                                                                    break;
                                                                                                                                case ConstantsWs.WS_STATUS_NOSHARINGS /* 315 */:
                                                                                                                                    statusChanged = new RhTemp();
                                                                                                                                    break;
                                                                                                                                case ConstantsWs.WS_STATUS_WRONG_SHARINGAPPROVAL /* 316 */:
                                                                                                                                    statusChanged = new WorkoutScreenList();
                                                                                                                                    break;
                                                                                                                                case ConstantsWs.WS_STATUS_SHARINGUPDATEERROR /* 317 */:
                                                                                                                                    statusChanged = new WorkoutScreenMetadata();
                                                                                                                                    break;
                                                                                                                                case ConstantsWs.WS_STATUS_PROASSOCIATIONMISMATCH /* 318 */:
                                                                                                                                    statusChanged = new WorkoutScreenGlyphData();
                                                                                                                                    break;
                                                                                                                                case ConstantsWs.WS_STATUS_ASSOCDELETEDNONPROS /* 319 */:
                                                                                                                                    statusChanged = new WorkoutScreenName();
                                                                                                                                    break;
                                                                                                                                case ConstantsWs.WS_STATUS_WRONGLASTUSEDDATE /* 320 */:
                                                                                                                                    statusChanged = new SyncRequest();
                                                                                                                                    break;
                                                                                                                                case ConstantsWs.WS_STATUS_WRONGTYPE /* 321 */:
                                                                                                                                    statusChanged = new WorkoutGpsStatus();
                                                                                                                                    break;
                                                                                                                                case ConstantsWs.WS_STATUS_MEASDELLASTERROR /* 322 */:
                                                                                                                                    statusChanged = new Silent();
                                                                                                                                    break;
                                                                                                                                case ConstantsWs.WS_STATUS_WRONGAPPLIVER /* 323 */:
                                                                                                                                    statusChanged = new StoredSignalMeta();
                                                                                                                                    break;
                                                                                                                                case ConstantsWs.WS_STATUS_WRONGAPPNAME /* 324 */:
                                                                                                                                    statusChanged = new StoredSignalData();
                                                                                                                                    break;
                                                                                                                                case ConstantsWs.WS_STATUS_WRONGAPPPFM /* 325 */:
                                                                                                                                    statusChanged = new Id();
                                                                                                                                    break;
                                                                                                                                case ConstantsWs.WS_STATUS_UNKNOWN_MEASGRP /* 326 */:
                                                                                                                                    statusChanged = new StoredSignalMetaExtend();
                                                                                                                                    break;
                                                                                                                                case ConstantsWs.WS_STATUS_UNKNOWN_ACCOUNT /* 327 */:
                                                                                                                                    statusChanged = new UnitConversionParameters();
                                                                                                                                    break;
                                                                                                                                case ConstantsWs.WS_STATUS_UNKNOWN_DEVUSER /* 328 */:
                                                                                                                                    statusChanged = new CustoScreenMetadata();
                                                                                                                                    break;
                                                                                                                                case ConstantsWs.WS_STATUS_UNKNOWN_ASSOCIATION /* 329 */:
                                                                                                                                    statusChanged = new AlgorithmVersion();
                                                                                                                                    break;
                                                                                                                                case ConstantsWs.WS_STATUS_UNKNOWN_DEVICE /* 330 */:
                                                                                                                                    statusChanged = new FirmwareVersion();
                                                                                                                                    break;
                                                                                                                                case ConstantsWs.WS_STATUS_WRONGMFGID /* 331 */:
                                                                                                                                    statusChanged = new RawDataCmd();
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    switch (s13) {
                                                                                                                                        case ConstantsWs.WS_STATUS_EXPIRED_CREATION_TOKEN /* 513 */:
                                                                                                                                            statusChanged = new WifiAnt();
                                                                                                                                            break;
                                                                                                                                        case ConstantsWs.WS_STATUS_EXPIRED_PROVIDER_TOKEN /* 514 */:
                                                                                                                                            statusChanged = new Backlight();
                                                                                                                                            break;
                                                                                                                                        case ConstantsWs.WS_STATUS_INVALID_FUTURE_DATE /* 515 */:
                                                                                                                                            statusChanged = new Lcd();
                                                                                                                                            break;
                                                                                                                                        case ConstantsWs.WS_STATUS_ERROR_LINK_USER_DEVICE /* 516 */:
                                                                                                                                            statusChanged = new Gpio();
                                                                                                                                            break;
                                                                                                                                        case ConstantsWs.WS_STATUS_ALREADY_ASSOCIATED /* 517 */:
                                                                                                                                            statusChanged = new Perso();
                                                                                                                                            break;
                                                                                                                                        case ConstantsWs.WS_STATUS_ERROR_SYNCHROTIME /* 518 */:
                                                                                                                                            statusChanged = new Uint32();
                                                                                                                                            break;
                                                                                                                                        case ConstantsWs.WS_STATUS_ERROR_DB /* 519 */:
                                                                                                                                            statusChanged = new WppString();
                                                                                                                                            break;
                                                                                                                                        case ConstantsWs.WS_STATUS_ALREADY_EXIST /* 520 */:
                                                                                                                                            statusChanged = new Audiotest();
                                                                                                                                            break;
                                                                                                                                        case ConstantsWs.WS_STATUS_MSG_TOO_LONG /* 521 */:
                                                                                                                                            statusChanged = new Weighttest();
                                                                                                                                            break;
                                                                                                                                        case ConstantsWs.WS_STATUS_TIMEOUT /* 522 */:
                                                                                                                                            statusChanged = new Adc();
                                                                                                                                            break;
                                                                                                                                        case ConstantsWs.WS_STATUS_EMANCIPATION_BAD_EMAIL /* 523 */:
                                                                                                                                            statusChanged = new Dac();
                                                                                                                                            break;
                                                                                                                                        case ConstantsWs.WS_STATUS_BAD_STATE /* 524 */:
                                                                                                                                            statusChanged = new WeightCal();
                                                                                                                                            break;
                                                                                                                                        case ConstantsWs.WS_STATUS_ERROR_DB_CONNECTION /* 525 */:
                                                                                                                                            statusChanged = new Wl();
                                                                                                                                            break;
                                                                                                                                        case ConstantsWs.WS_STATUS_ALREADY_DELETED /* 526 */:
                                                                                                                                            statusChanged = new Zmeter();
                                                                                                                                            break;
                                                                                                                                        case ConstantsWs.WS_STATUS_USER_DELETION_ERROR /* 527 */:
                                                                                                                                            statusChanged = new ZmeterCal();
                                                                                                                                            break;
                                                                                                                                        case ConstantsWs.WS_STATUS_ACCOUNT_DELETION_ERROR /* 528 */:
                                                                                                                                            statusChanged = new Spiflash();
                                                                                                                                            break;
                                                                                                                                        case ConstantsWs.WS_STATUS_USER_REACTIVATION_ERROR /* 529 */:
                                                                                                                                            statusChanged = new Rtc();
                                                                                                                                            break;
                                                                                                                                        case ConstantsWs.WS_STATUS_ACCOUNT_REACTIVATION_ERROR /* 530 */:
                                                                                                                                            statusChanged = new WeightVerif();
                                                                                                                                            break;
                                                                                                                                        case ConstantsWs.WS_STATUS_PAYMENT_FAILED /* 531 */:
                                                                                                                                            statusChanged = new Dump();
                                                                                                                                            break;
                                                                                                                                        case ConstantsWs.WS_STATUS_WRONGDEVMODEL /* 532 */:
                                                                                                                                            statusChanged = new Selftest();
                                                                                                                                            break;
                                                                                                                                        case ConstantsWs.WS_STATUS_TOOMANYACCOUNTS /* 533 */:
                                                                                                                                            statusChanged = new Slot();
                                                                                                                                            break;
                                                                                                                                        case ConstantsWs.WS_STATUS_UNAUTHORIZED_PASSWORD /* 534 */:
                                                                                                                                            statusChanged = new IapWci();
                                                                                                                                            break;
                                                                                                                                        case ConstantsWs.WS_STATUS_UNAUTHORIZED_LOCALIZATION /* 535 */:
                                                                                                                                            statusChanged = new Int32();
                                                                                                                                            break;
                                                                                                                                        case ConstantsWs.WS_STATUS_INVALID_PASSWORD_TOO_SHORT /* 536 */:
                                                                                                                                            statusChanged = new Uint64();
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            switch (s13) {
                                                                                                                                                case 1281:
                                                                                                                                                    statusChanged = new TimeSet();
                                                                                                                                                    break;
                                                                                                                                                case 1282:
                                                                                                                                                    statusChanged = new TimeSetReply();
                                                                                                                                                    break;
                                                                                                                                                case 1283:
                                                                                                                                                    statusChanged = new TrackerUser();
                                                                                                                                                    break;
                                                                                                                                                case 1284:
                                                                                                                                                    statusChanged = new BatteryStatus();
                                                                                                                                                    break;
                                                                                                                                                case 1285:
                                                                                                                                                    statusChanged = new WamDisplayedInfo();
                                                                                                                                                    break;
                                                                                                                                                case 1286:
                                                                                                                                                    statusChanged = new WamVasistasGet();
                                                                                                                                                    break;
                                                                                                                                                case 1287:
                                                                                                                                                    statusChanged = new WamDailyActivities();
                                                                                                                                                    break;
                                                                                                                                                case 1288:
                                                                                                                                                    statusChanged = new WamRawData();
                                                                                                                                                    break;
                                                                                                                                                case 1289:
                                                                                                                                                    statusChanged = new WamScreensList();
                                                                                                                                                    break;
                                                                                                                                                case 1290:
                                                                                                                                                    statusChanged = new WamAutoSleep();
                                                                                                                                                    break;
                                                                                                                                                case 1291:
                                                                                                                                                    statusChanged = new AlarmSetSimple();
                                                                                                                                                    break;
                                                                                                                                                case 1292:
                                                                                                                                                    statusChanged = new HandsMove();
                                                                                                                                                    break;
                                                                                                                                                case 1293:
                                                                                                                                                    statusChanged = new DemoStart();
                                                                                                                                                    break;
                                                                                                                                                default:
                                                                                                                                                    switch (s13) {
                                                                                                                                                        case 1296:
                                                                                                                                                            statusChanged = new SetTime();
                                                                                                                                                            break;
                                                                                                                                                        case 1297:
                                                                                                                                                            statusChanged = new TrackerGoal();
                                                                                                                                                            break;
                                                                                                                                                        case 1298:
                                                                                                                                                            statusChanged = new Alarm();
                                                                                                                                                            break;
                                                                                                                                                        case 1299:
                                                                                                                                                            statusChanged = new UserSecret();
                                                                                                                                                            break;
                                                                                                                                                        case 1300:
                                                                                                                                                            statusChanged = new Name();
                                                                                                                                                            break;
                                                                                                                                                        case ConstantsWs.ECG_REVIEW_READING_STATUS_INTERNAL_REJECTED_BUT_RETRY_ALLOWED /* 1301 */:
                                                                                                                                                            statusChanged = new VasistasType();
                                                                                                                                                            break;
                                                                                                                                                        case 1302:
                                                                                                                                                            statusChanged = new ScreenList();
                                                                                                                                                            break;
                                                                                                                                                        default:
                                                                                                                                                            switch (s13) {
                                                                                                                                                                case 1537:
                                                                                                                                                                    statusChanged = new WamVasistasHead();
                                                                                                                                                                    break;
                                                                                                                                                                case 1538:
                                                                                                                                                                    statusChanged = new WamVasistasDuration();
                                                                                                                                                                    break;
                                                                                                                                                                case 1539:
                                                                                                                                                                    statusChanged = new WamVasistasAwake();
                                                                                                                                                                    break;
                                                                                                                                                                case 1540:
                                                                                                                                                                    statusChanged = new WamVasistasWalk();
                                                                                                                                                                    break;
                                                                                                                                                                case 1541:
                                                                                                                                                                    statusChanged = new WamVasistasRun();
                                                                                                                                                                    break;
                                                                                                                                                                case 1542:
                                                                                                                                                                    statusChanged = new WamVasistasSleepDbg();
                                                                                                                                                                    break;
                                                                                                                                                                case 1543:
                                                                                                                                                                    statusChanged = new WamVasistasSleep();
                                                                                                                                                                    break;
                                                                                                                                                                case 1544:
                                                                                                                                                                    statusChanged = new WamVasistasMetCal();
                                                                                                                                                                    break;
                                                                                                                                                                case 1545:
                                                                                                                                                                    statusChanged = new VasistasSwimV1();
                                                                                                                                                                    break;
                                                                                                                                                                case 1546:
                                                                                                                                                                    statusChanged = new WamVasistasMetCalEarned();
                                                                                                                                                                    break;
                                                                                                                                                                case 1547:
                                                                                                                                                                    statusChanged = new VasistasActiRecoV1V2();
                                                                                                                                                                    break;
                                                                                                                                                                case 1548:
                                                                                                                                                                    statusChanged = new VasistasUncertainSwim();
                                                                                                                                                                    break;
                                                                                                                                                                case 1549:
                                                                                                                                                                    statusChanged = new VasistasSwimType();
                                                                                                                                                                    break;
                                                                                                                                                                default:
                                                                                                                                                                    statusChanged = null;
                                                                                                                                                                    break;
                                                                                                                                                            }
                                                                                                                                                    }
                                                                                                                                            }
                                                                                                                                    }
                                                                                                                            }
                                                                                                                    }
                                                                                                            }
                                                                                                    }
                                                                                            }
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                                } else {
                                                    statusChanged = new WsmVasistasGeneralV2();
                                                    break;
                                                }
                                            } else {
                                                statusChanged = new WsmVasistasGeneral();
                                                break;
                                            }
                                    }
                                } else {
                                    statusChanged = new WpmStart();
                                }
                            } else {
                                statusChanged = new WpmSetMode();
                            }
                        } else {
                            statusChanged = new NetupdateResult();
                        }
                    } else {
                        statusChanged = new NetupdateProgress();
                    }
                } else {
                    statusChanged = new SettingsChanged();
                }
            } else {
                statusChanged = new StatusChanged();
            }
            if (statusChanged != null) {
                statusChanged.initWithBytes(wrap);
                arrayList.add(statusChanged);
            } else {
                int i11 = wrap.getShort() & 65535;
                if (wrap.position() + i11 <= wrap.limit()) {
                    byte[] bArr2 = new byte[i11];
                    wrap.get(bArr2);
                    arrayList.add(new qj.g(s13, bArr2));
                    String simpleName = i.class.getSimpleName();
                    x70.b.t(simpleName, "Unknown WppObject with type : " + Wpp.prettyCommand(s13), new Object[0]);
                } else {
                    wrap.position(wrap.position() - 4);
                    byte[] bArr3 = new byte[wrap.limit() - wrap.position()];
                    wrap.get(bArr3);
                    arrayList.add(new qj.f(bArr3));
                    String simpleName2 = i.class.getSimpleName();
                    x70.b.t(simpleName2, "Unknown data  : " + Wpp.prettyBytes(bArr3), new Object[0]);
                }
            }
        }
        return new f(b10, s11, arrayList);
    }
}
