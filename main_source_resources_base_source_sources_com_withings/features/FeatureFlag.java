package com.withings.features;

import com.withings.features.model.FeatureFlagCategory;
import java.io.Serializable;
import kotlin.Metadata;
import sm0.b;
import xr.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FeatureFlag.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/features/FeatureFlag;", "", "Lxr/a;", "Ljava/io/Serializable;", "flags"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FeatureFlag implements a, Serializable {
    public static final FeatureFlag A;
    public static final FeatureFlag B;
    public static final FeatureFlag F;
    public static final FeatureFlag G;
    public static final FeatureFlag M;
    public static final FeatureFlag P;
    public static final FeatureFlag Q;
    public static final FeatureFlag R;
    public static final FeatureFlag S;
    public static final FeatureFlag T;
    public static final FeatureFlag W;
    public static final FeatureFlag X;
    public static final FeatureFlag Y;
    public static final FeatureFlag Z;

    /* renamed from: e  reason: collision with root package name */
    public static final FeatureFlag f39108e;

    /* renamed from: f  reason: collision with root package name */
    public static final FeatureFlag f39109f;

    /* renamed from: g  reason: collision with root package name */
    public static final FeatureFlag f39110g;

    /* renamed from: h  reason: collision with root package name */
    public static final FeatureFlag f39111h;

    /* renamed from: i  reason: collision with root package name */
    public static final FeatureFlag f39112i;

    /* renamed from: j  reason: collision with root package name */
    public static final FeatureFlag f39113j;

    /* renamed from: k  reason: collision with root package name */
    public static final FeatureFlag f39114k;

    /* renamed from: l  reason: collision with root package name */
    public static final FeatureFlag f39115l;

    /* renamed from: l0  reason: collision with root package name */
    public static final FeatureFlag f39116l0;

    /* renamed from: m  reason: collision with root package name */
    public static final FeatureFlag f39117m;

    /* renamed from: m0  reason: collision with root package name */
    public static final FeatureFlag f39118m0;

    /* renamed from: n  reason: collision with root package name */
    public static final FeatureFlag f39119n;

    /* renamed from: n0  reason: collision with root package name */
    public static final FeatureFlag f39120n0;

    /* renamed from: o  reason: collision with root package name */
    public static final FeatureFlag f39121o;

    /* renamed from: o0  reason: collision with root package name */
    public static final FeatureFlag f39122o0;

    /* renamed from: p  reason: collision with root package name */
    public static final FeatureFlag f39123p;

    /* renamed from: p0  reason: collision with root package name */
    public static final FeatureFlag f39124p0;

    /* renamed from: q  reason: collision with root package name */
    public static final FeatureFlag f39125q;

    /* renamed from: q0  reason: collision with root package name */
    public static final FeatureFlag f39126q0;

    /* renamed from: r  reason: collision with root package name */
    public static final FeatureFlag f39127r;

    /* renamed from: r0  reason: collision with root package name */
    public static final FeatureFlag f39128r0;

    /* renamed from: s  reason: collision with root package name */
    public static final FeatureFlag f39129s;

    /* renamed from: s0  reason: collision with root package name */
    public static final FeatureFlag f39130s0;

    /* renamed from: t  reason: collision with root package name */
    public static final FeatureFlag f39131t;

    /* renamed from: t0  reason: collision with root package name */
    public static final FeatureFlag f39132t0;

    /* renamed from: u  reason: collision with root package name */
    public static final FeatureFlag f39133u;

    /* renamed from: u0  reason: collision with root package name */
    public static final FeatureFlag f39134u0;

    /* renamed from: v  reason: collision with root package name */
    public static final FeatureFlag f39135v;

    /* renamed from: v0  reason: collision with root package name */
    public static final FeatureFlag f39136v0;

    /* renamed from: w  reason: collision with root package name */
    public static final FeatureFlag f39137w;

    /* renamed from: w0  reason: collision with root package name */
    private static final /* synthetic */ FeatureFlag[] f39138w0;

    /* renamed from: x  reason: collision with root package name */
    public static final FeatureFlag f39139x;

    /* renamed from: y  reason: collision with root package name */
    public static final FeatureFlag f39140y;

    /* renamed from: z  reason: collision with root package name */
    public static final FeatureFlag f39141z;

    /* renamed from: a  reason: collision with root package name */
    private final FeatureFlagCategory f39142a;

    /* renamed from: b  reason: collision with root package name */
    private final String f39143b;

    /* renamed from: c  reason: collision with root package name */
    private final String f39144c;

    /* renamed from: d  reason: collision with root package name */
    private final String f39145d = name();

    static {
        FeatureFlagCategory featureFlagCategory = FeatureFlagCategory.f39185b;
        FeatureFlag featureFlag = new FeatureFlag("CYCLE_TRACKING_MONTHLY_GRAPH", 0, featureFlagCategory, "Cycle Tracking monthly graph", "Enable cycle tracking monthly graph");
        f39108e = featureFlag;
        FeatureFlagCategory featureFlagCategory2 = FeatureFlagCategory.f39186c;
        FeatureFlag featureFlag2 = new FeatureFlag("CYCLE_TRACKING_FACTORS", 1, featureFlagCategory2, "Cycle Tracking factors", "Enable cycle tracking factors");
        f39109f = featureFlag2;
        FeatureFlag featureFlag3 = new FeatureFlag("WPA02", 2, featureFlagCategory, "WPA02", "Display the WPA02 in the installable devices list");
        f39110g = featureFlag3;
        FeatureFlag featureFlag4 = new FeatureFlag("HWA10_ADVERTISING_KEY_COMMAND", 3, featureFlagCategory, "HWA10 new advertising command", "Use ASSOCIATION_KEYS_SET for HWA10");
        f39111h = featureFlag4;
        FeatureFlag featureFlag5 = new FeatureFlag("REMOVE_SCALE_SESSION_DELAY", 4, featureFlagCategory, "Remove SCALE_SESSION delay", "Remove SCALE_SESSION delay for all BLE devices");
        f39112i = featureFlag5;
        FeatureFlag featureFlag6 = new FeatureFlag("SCT02", 5, featureFlagCategory, "SCT02", "Enable SCT02 installation");
        f39113j = featureFlag6;
        FeatureFlag featureFlag7 = new FeatureFlag("VO2_LIB", 6, featureFlagCategory, "Use vo2 kmp lib", "Use vo2 kmp lib");
        f39114k = featureFlag7;
        FeatureFlag featureFlag8 = new FeatureFlag("DISPLAY_IRREGULAR_HR_TUTO_FOR_HWA10", 7, featureFlagCategory, "Display irregular HR tutorial", "Display irregular HR tutorial");
        f39115l = featureFlag8;
        FeatureFlag featureFlag9 = new FeatureFlag("LOKALISE_SDK", 8, featureFlagCategory, "Lokalise SDK", "Enable OTA Lokalise wordings");
        f39117m = featureFlag9;
        FeatureFlag featureFlag10 = new FeatureFlag("GOOGLE_FIT_TO_HEALTH_CONNECT_MIGRATION", 9, featureFlagCategory, "Migrate Google Fit to Health Connect sync", "Stop promoting Google Fit in favor to Health Connect sync");
        FeatureFlag featureFlag11 = new FeatureFlag("USE_RETROFIT_2", 10, featureFlagCategory, "Use Retrofit2 for API calls", "When enabled, reworked APIs will use Retrofit 2 instead of Retrofit 1");
        f39119n = featureFlag11;
        FeatureFlag featureFlag12 = new FeatureFlag("HEALTH_INSIGHTS", 11, featureFlagCategory, "Health Insights", "Show health insights in the Measure Tab (sync necessary)");
        f39121o = featureFlag12;
        FeatureFlag featureFlag13 = new FeatureFlag("QR_CODE_WIFI_CONF", 12, featureFlagCategory, "Use QR code to setup WiFi", "Use QR code to setup WiFi");
        f39123p = featureFlag13;
        FeatureFlag featureFlag14 = new FeatureFlag("MERGE_VASCULAR_AGE_AND_PWV_SCREEN", 13, featureFlagCategory, "Merge vascular age and pwv graph", "Make pwv subGraph of VascularAge graph");
        f39125q = featureFlag14;
        FeatureFlag featureFlag15 = new FeatureFlag("GET_TO_100", 14, featureFlagCategory, "New UI for HIS score", "New Ui for His component with graph and criteria part");
        f39127r = featureFlag15;
        FeatureFlag featureFlag16 = new FeatureFlag("DATA_SHARING", 15, featureFlagCategory, "Data Sharing", "Enable data sharing feature");
        f39129s = featureFlag16;
        FeatureFlag featureFlag17 = new FeatureFlag("WPM07", 16, featureFlagCategory, "WPM07 - Bpm Pro 2", "Enable Bpm pro 2 in the app");
        f39131t = featureFlag17;
        FeatureFlag featureFlag18 = new FeatureFlag("NEW_TEMPERATURE", 17, featureFlagCategory, "New UI for temperature", "New UI for temperature and fever episode");
        f39133u = featureFlag18;
        FeatureFlag featureFlag19 = new FeatureFlag("NEW_WPM_CLASSIFICATION", 18, featureFlagCategory, "Remove app command to set the classification", "The app command shouldn't be used anymore");
        f39135v = featureFlag19;
        FeatureFlag featureFlag20 = new FeatureFlag("NUTRISYNC_EXPERIENCE", 19, featureFlagCategory, "Nutrisync experience", "Visualisation of WPA02 data");
        f39137w = featureFlag20;
        FeatureFlag featureFlag21 = new FeatureFlag("NEW_SEGMENTAL", 20, featureFlagCategory, "New UI for segmental view", "New UI for segmental view");
        f39139x = featureFlag21;
        FeatureFlag featureFlag22 = new FeatureFlag("NEW_WIFI_SETUP_SCREEN", 21, featureFlagCategory, "New Wifi Setup Screen", "New UI for Device Wifi Setup Screen");
        f39140y = featureFlag22;
        FeatureFlag featureFlag23 = new FeatureFlag("HIGHLIGHT_CURRENT_WIFI", 22, featureFlagCategory, "Highlight current Wi-Fi", "Highlight user current Wi-Fi network during wifi configuration");
        f39141z = featureFlag23;
        FeatureFlag featureFlag24 = new FeatureFlag("SWIPE_TO_DELETE_WEIGHT_ITEM", 23, featureFlagCategory2, "Enable swipe to delete weight item", "When activated, allow swipe for deleting weight item");
        A = featureFlag24;
        FeatureFlag featureFlag25 = new FeatureFlag("RESPIRATORY_VERTICAL", 24, featureFlagCategory2, "Respiratory Vertical", "Add the respiratory vertical back in the app");
        B = featureFlag25;
        FeatureFlag featureFlag26 = new FeatureFlag("ECG_SW2_EU_HWA10", 25, featureFlagCategory2, "Enable sw2 for hwa10", "Enable ecg sw2 for hwa10 europe ");
        F = featureFlag26;
        FeatureFlag featureFlag27 = new FeatureFlag("SCANWATCH_FIND_MY_PHONE_SHORTCUT", 26, featureFlagCategory2, "Find my phone", "Display the find my phone ScanWatch shortcut action");
        G = featureFlag27;
        FeatureFlag featureFlag28 = new FeatureFlag("LEADERBOARD_ITEM_STEPS", 27, featureFlagCategory2, "leaderboard item", "Add leaderboard item on step view");
        M = featureFlag28;
        FeatureFlag featureFlag29 = new FeatureFlag("SEND_WORKOUT_START_CMD_FROM_APP", 28, featureFlagCategory2, "Send CMD_WORKOUT_START command from app", "Send the CMD_WORKOUT_START command to the watch when starting a workout");
        P = featureFlag29;
        FeatureFlag featureFlag30 = new FeatureFlag("ONLINE_MEASURE_SYNC_FOR_ALL_DEVICES", 29, featureFlagCategory2, "Online measure sync", "Use the online measure sync for all devices");
        Q = featureFlag30;
        FeatureFlag featureFlag31 = new FeatureFlag("PROXIMITY_DETECTION_SETUP_DEVICE", 30, featureFlagCategory2, "Detect Device", "Detect device ready to be installed in proximity");
        R = featureFlag31;
        FeatureFlag featureFlag32 = new FeatureFlag("NEW_INSTALL_FLOW", 31, featureFlagCategory2, "New install flow", "New install flow");
        S = featureFlag32;
        FeatureFlag featureFlag33 = new FeatureFlag("EXPLANATIONS_IN_GUIDED_PRESENTATION", 32, featureFlagCategory2, "Explanations in guided presentation", "Use guided presentation template instead of Legacy tutorials");
        T = featureFlag33;
        FeatureFlag featureFlag34 = new FeatureFlag("ENABLE_TLS", 33, featureFlagCategory2, "Enable TLS communication", "Enable TLS communication with device");
        FeatureFlagCategory featureFlagCategory3 = FeatureFlagCategory.f39188e;
        FeatureFlag featureFlag35 = new FeatureFlag("HTML_TIMELINE_ITEMS", 34, featureFlagCategory3, "HTML timeline items", "Show HTML timeline items");
        W = featureFlag35;
        FeatureFlag featureFlag36 = new FeatureFlag("RESPIRATORY_RATE", 35, featureFlagCategory3, "Respiratory Rate during night", "Display the graph in sleep detail");
        X = featureFlag36;
        FeatureFlag featureFlag37 = new FeatureFlag("FIND_MY_PHONE", 36, featureFlagCategory3, "Find my phone", "Allow to ring your phone from your watch");
        Y = featureFlag37;
        FeatureFlag featureFlag38 = new FeatureFlag("IMPROVE_CALCULATION_HEARTRATE_GRAPH", 37, featureFlagCategory3, "Improve calculation of heartRate graph", "Change the way heartRate trend is calculated");
        Z = featureFlag38;
        FeatureFlag featureFlag39 = new FeatureFlag("NIGHT_IS_PROCESSING", 38, featureFlagCategory3, "Night is processing", "Display \"Night is processing\" for sleep track item");
        f39116l0 = featureFlag39;
        FeatureFlag featureFlag40 = new FeatureFlag("MOVE_HANDS", 39, featureFlagCategory3, "Move Hands", "Allow Hands position to 10:10");
        f39118m0 = featureFlag40;
        FeatureFlag featureFlag41 = new FeatureFlag("KMP_AUTHENTICATION", 40, featureFlagCategory3, "login via kmp", "Login using KMP");
        f39120n0 = featureFlag41;
        FeatureFlag featureFlag42 = new FeatureFlag("STETHO_FILTER_OFF", 41, featureFlagCategory3, "disable stetho filter", "disable stetho filter in heart sound");
        f39122o0 = featureFlag42;
        FeatureFlag featureFlag43 = new FeatureFlag("WPM03_ERROR_ITEM", 42, featureFlagCategory3, "WPM03 error timeline item", "Enable WPM03 error timeline item");
        f39124p0 = featureFlag43;
        FeatureFlagCategory featureFlagCategory4 = FeatureFlagCategory.f39189f;
        FeatureFlag featureFlag44 = new FeatureFlag("ALARM_START_END_DATES", 43, featureFlagCategory4, "Alarm with start and end dates", "Enable start and end dates for alarm");
        f39126q0 = featureFlag44;
        FeatureFlag featureFlag45 = new FeatureFlag("ADVANCED_GENDER", 44, featureFlagCategory4, "Advanced gender (only in en language)", "Allow to select a pronoun and an advanced gender in english mode");
        f39128r0 = featureFlag45;
        FeatureFlag featureFlag46 = new FeatureFlag("DISPLAY_MISSION_BUTTON_ON_HOME", 45, featureFlagCategory4, "Display a dynamic button in home mission section", "Display a button which redirects to program or allows user to end a program.");
        FeatureFlag featureFlag47 = new FeatureFlag("MANUAL_LOGGING", 46, featureFlagCategory4, "Manual Logging", "Enable manual logs");
        f39130s0 = featureFlag47;
        FeatureFlag featureFlag48 = new FeatureFlag("FIT_SLEEP_IMPORT", 47, featureFlagCategory4, "Sleep Import", "Enable partner sleep import");
        f39132t0 = featureFlag48;
        FeatureFlag featureFlag49 = new FeatureFlag("SHOW_MAIN_WEIGHT_NORMALITY_ZONE", 48, featureFlagCategory4, "Display normality zone", "Enable or not the normality zone on main weight graph");
        f39134u0 = featureFlag49;
        FeatureFlag featureFlag50 = new FeatureFlag("WEIGHT_FILTER", 49, featureFlagCategory4, "Filters on Weight main graph", "Show filter for average/median on the weight graph");
        f39136v0 = featureFlag50;
        FeatureFlag[] featureFlagArr = {featureFlag, featureFlag2, featureFlag3, featureFlag4, featureFlag5, featureFlag6, featureFlag7, featureFlag8, featureFlag9, featureFlag10, featureFlag11, featureFlag12, featureFlag13, featureFlag14, featureFlag15, featureFlag16, featureFlag17, featureFlag18, featureFlag19, featureFlag20, featureFlag21, featureFlag22, featureFlag23, featureFlag24, featureFlag25, featureFlag26, featureFlag27, featureFlag28, featureFlag29, featureFlag30, featureFlag31, featureFlag32, featureFlag33, featureFlag34, featureFlag35, featureFlag36, featureFlag37, featureFlag38, featureFlag39, featureFlag40, featureFlag41, featureFlag42, featureFlag43, featureFlag44, featureFlag45, featureFlag46, featureFlag47, featureFlag48, featureFlag49, featureFlag50};
        f39138w0 = featureFlagArr;
        b.a(featureFlagArr);
    }

    private FeatureFlag(String str, int i11, FeatureFlagCategory featureFlagCategory, String str2, String str3) {
        this.f39142a = featureFlagCategory;
        this.f39143b = str2;
        this.f39144c = str3;
    }

    public static FeatureFlag valueOf(String str) {
        return (FeatureFlag) Enum.valueOf(FeatureFlag.class, str);
    }

    public static FeatureFlag[] values() {
        return (FeatureFlag[]) f39138w0.clone();
    }

    @Override // xr.a
    public final FeatureFlagCategory a() {
        return this.f39142a;
    }

    @Override // xr.a
    public final String b() {
        return this.f39144c;
    }

    @Override // xr.a
    public final String getKey() {
        return this.f39145d;
    }

    @Override // xr.a
    public final String getTitle() {
        return this.f39143b;
    }
}
