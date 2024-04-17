package com.withings.features;

import com.withings.features.model.FeatureFlagCategory;
import kotlin.Metadata;
import sm0.b;
import xr.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TestSetting.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/features/TestSetting;", "", "Lxr/a;", "flags"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class TestSetting implements a {

    /* renamed from: e  reason: collision with root package name */
    public static final TestSetting f39170e;

    /* renamed from: f  reason: collision with root package name */
    public static final TestSetting f39171f;

    /* renamed from: g  reason: collision with root package name */
    public static final TestSetting f39172g;

    /* renamed from: h  reason: collision with root package name */
    public static final TestSetting f39173h;

    /* renamed from: i  reason: collision with root package name */
    public static final TestSetting f39174i;

    /* renamed from: j  reason: collision with root package name */
    public static final TestSetting f39175j;

    /* renamed from: k  reason: collision with root package name */
    public static final TestSetting f39176k;

    /* renamed from: l  reason: collision with root package name */
    public static final TestSetting f39177l;

    /* renamed from: m  reason: collision with root package name */
    public static final TestSetting f39178m;

    /* renamed from: n  reason: collision with root package name */
    public static final TestSetting f39179n;

    /* renamed from: o  reason: collision with root package name */
    private static final /* synthetic */ TestSetting[] f39180o;

    /* renamed from: a  reason: collision with root package name */
    private final String f39181a;

    /* renamed from: b  reason: collision with root package name */
    private final String f39182b;

    /* renamed from: c  reason: collision with root package name */
    private final String f39183c = name();

    /* renamed from: d  reason: collision with root package name */
    private final FeatureFlagCategory f39184d = FeatureFlagCategory.f39187d;

    static {
        TestSetting testSetting = new TestSetting("DEBUG_FIREBASE", 0, "Enable Firebase", "Force to know if a feature flags is enabled on Firebase (for Firebase feature flag of course).\n BE CAREFUL WITH THAT OK ?? VERY DANGEROUS ! THANKS YOU");
        TestSetting testSetting2 = new TestSetting("SECTION_CRASHLOGGER", 1, "CrashLogger", "Enable CrashLogger if you want to force the app to crash when an error is occurred");
        TestSetting testSetting3 = new TestSetting("FORCE_AFIB_ECG", 2, "Force AFib ECG", "Force status of AFib measure during an ECG to positive");
        f39170e = testSetting3;
        TestSetting testSetting4 = new TestSetting("MEASURES_GROUP_SQL_LOGGING", 3, "Log measures-group SQL request timing", "Allow measures-group SQL request timing log in logcat, need 'Logcat' FF");
        f39171f = testSetting4;
        TestSetting testSetting5 = new TestSetting("DISPLAY_COORDINATES_IN_GRAPH", 4, "Display Viewport coordinates", "Display the graph rect coordinates in the app");
        f39172g = testSetting5;
        TestSetting testSetting6 = new TestSetting("NOTIFICATION_LOGGER", 5, "Enable notification logger", "Log received notifications");
        f39173h = testSetting6;
        TestSetting testSetting7 = new TestSetting("NO_WPP_SERVICE_FOREGROUND", 6, "Don't launch wpp service in foreground", "Don't launch wpp service foreground and see if there is a connectivity drawback");
        f39174i = testSetting7;
        TestSetting testSetting8 = new TestSetting("KMP_AUTHENTICATION_DEBUG", 7, "debugging multi account kmp", "Debugging multi account kmp");
        f39175j = testSetting8;
        TestSetting testSetting9 = new TestSetting("DISABLE_PARTNER_FILTER", 8, "disable_partner_filter", "Disable partner feature filter");
        f39176k = testSetting9;
        TestSetting testSetting10 = new TestSetting("SHOULD_SKIP_TUTORIALS_MEASURE_ACHIEVE", 9, "Skip measure & achieve tab tutorial", "When enabled, skip measure & achieve tab tutorial");
        f39177l = testSetting10;
        TestSetting testSetting11 = new TestSetting("COMPANION_DEVICE_MANAGER", 10, "Companion Device Manager", "Enable usage of CDM");
        f39178m = testSetting11;
        TestSetting testSetting12 = new TestSetting("STRICT_MODE", 11, "Strict Mode", "Using Strict Mode allows you to see flash and logs when strict policy is broken");
        f39179n = testSetting12;
        TestSetting[] testSettingArr = {testSetting, testSetting2, testSetting3, testSetting4, testSetting5, testSetting6, testSetting7, testSetting8, testSetting9, testSetting10, testSetting11, testSetting12};
        f39180o = testSettingArr;
        b.a(testSettingArr);
    }

    private TestSetting(String str, int i11, String str2, String str3) {
        this.f39181a = str2;
        this.f39182b = str3;
    }

    public static TestSetting valueOf(String str) {
        return (TestSetting) Enum.valueOf(TestSetting.class, str);
    }

    public static TestSetting[] values() {
        return (TestSetting[]) f39180o.clone();
    }

    @Override // xr.a
    public final FeatureFlagCategory a() {
        return this.f39184d;
    }

    @Override // xr.a
    public final String b() {
        return this.f39182b;
    }

    @Override // xr.a
    public final String getKey() {
        return this.f39183c;
    }

    @Override // xr.a
    public final String getTitle() {
        return this.f39181a;
    }
}
