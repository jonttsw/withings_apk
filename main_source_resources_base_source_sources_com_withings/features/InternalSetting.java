package com.withings.features;

import com.withings.features.model.FeatureFlagCategory;
import kotlin.Metadata;
import sm0.b;
import xr.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InternalSetting.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/features/InternalSetting;", "", "Lxr/a;", "flags"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class InternalSetting implements a {

    /* renamed from: e  reason: collision with root package name */
    public static final InternalSetting f39146e;

    /* renamed from: f  reason: collision with root package name */
    public static final InternalSetting f39147f;

    /* renamed from: g  reason: collision with root package name */
    public static final InternalSetting f39148g;

    /* renamed from: h  reason: collision with root package name */
    public static final InternalSetting f39149h;

    /* renamed from: i  reason: collision with root package name */
    public static final InternalSetting f39150i;

    /* renamed from: j  reason: collision with root package name */
    public static final InternalSetting f39151j;

    /* renamed from: k  reason: collision with root package name */
    public static final InternalSetting f39152k;

    /* renamed from: l  reason: collision with root package name */
    public static final InternalSetting f39153l;

    /* renamed from: m  reason: collision with root package name */
    public static final InternalSetting f39154m;

    /* renamed from: n  reason: collision with root package name */
    public static final InternalSetting f39155n;

    /* renamed from: o  reason: collision with root package name */
    public static final InternalSetting f39156o;

    /* renamed from: p  reason: collision with root package name */
    public static final InternalSetting f39157p;

    /* renamed from: q  reason: collision with root package name */
    public static final InternalSetting f39158q;

    /* renamed from: r  reason: collision with root package name */
    public static final InternalSetting f39159r;

    /* renamed from: s  reason: collision with root package name */
    public static final InternalSetting f39160s;

    /* renamed from: t  reason: collision with root package name */
    public static final InternalSetting f39161t;

    /* renamed from: u  reason: collision with root package name */
    public static final InternalSetting f39162u;

    /* renamed from: v  reason: collision with root package name */
    public static final InternalSetting f39163v;

    /* renamed from: w  reason: collision with root package name */
    public static final InternalSetting f39164w;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ InternalSetting[] f39165x;

    /* renamed from: a  reason: collision with root package name */
    private final String f39166a;

    /* renamed from: b  reason: collision with root package name */
    private final String f39167b;

    /* renamed from: c  reason: collision with root package name */
    private final String f39168c = name();

    /* renamed from: d  reason: collision with root package name */
    private final FeatureFlagCategory f39169d = FeatureFlagCategory.f39186c;

    static {
        InternalSetting internalSetting = new InternalSetting("USE_BETA_WEBSERVICES", 0, "Use BETA Webservices", "Use BETA Webservices instead of PROD, needs to delog/relog");
        f39146e = internalSetting;
        InternalSetting internalSetting2 = new InternalSetting("DISCOURSE", 1, "Discourse", "Enable discourse");
        f39147f = internalSetting2;
        InternalSetting internalSetting3 = new InternalSetting("LOGCAT", 2, "Logcat", "Enable logcat logs, needs to kill app to work");
        f39148g = internalSetting3;
        InternalSetting internalSetting4 = new InternalSetting("SUGGESTIONS_IN_COMMENTS", 3, "Suggestions in comments", "Allow suggestions in comments ofr beta test purpose");
        f39149h = internalSetting4;
        InternalSetting internalSetting5 = new InternalSetting("DISPLAY_ANALYTICS_EVENTS", 4, "Display analytics event", "Display the analytics values sent, like key and values");
        f39150i = internalSetting5;
        InternalSetting internalSetting6 = new InternalSetting("DISPLAY_SPO2_AUTO", 5, "SpO2 auto", "Display SpO2 auto measurements");
        f39151j = internalSetting6;
        InternalSetting internalSetting7 = new InternalSetting("FORCE_END_PROGRAM_BUTTON", 6, "Force end button program", "Always show the Finish Program button when a program is ongoing.");
        f39152k = internalSetting7;
        InternalSetting internalSetting8 = new InternalSetting("CORE_TEMPERATURE_DEBUG_GRAPH", 7, "Debug core temperature screen", "Get an access to a debug graph screen of the core temperature.");
        f39153l = internalSetting8;
        InternalSetting internalSetting9 = new InternalSetting("PWV_DEBUG_VIEW", 8, "Enable the PWV debug view", "When activated, cells on PWV view shows both average (8) and real (0) values.");
        f39154m = internalSetting9;
        InternalSetting internalSetting10 = new InternalSetting("NERVE_HEALTH_MEASUREMENT_LIST_ALL_MEASURES", 9, "Nerve Health measurement list debug", "Give access to the \"Show all measures\" feature in the nerve health measurement list");
        f39155n = internalSetting10;
        InternalSetting internalSetting11 = new InternalSetting("SMART_NOTIFICATION_STACK_DEBUG", 10, "Add debug for the notification stack new design", "Debug options for the smart notification stack new design");
        InternalSetting internalSetting12 = new InternalSetting("NOTIFICATION_CATEGORY_BADGES", 11, "Notifications Category Badges", "Show category badges for notifications. WIP");
        InternalSetting internalSetting13 = new InternalSetting("RAWDUMP_LOGS_FILE", 12, "RawDump logs", "Log info about RAW DUMP sync in local file");
        f39156o = internalSetting13;
        InternalSetting internalSetting14 = new InternalSetting("VO2_FORCE_WITHINGS_ALGO", 13, "Force vo2 withings algo", "Force vo2 withings algo");
        f39157p = internalSetting14;
        InternalSetting internalSetting15 = new InternalSetting("NEW_GRAPH_ABSOLUTE_VALUE_GRAPH", 14, "Enable absolute value in graph", "Display absolute value of temperature inside graph pop up");
        f39158q = internalSetting15;
        InternalSetting internalSetting16 = new InternalSetting("NEW_GRAPH_TEMPERATURE_SHOW_BASELINE", 15, "Enable graph temperature baseline", "Enable the value of baseline inside temperature graph for H24");
        f39159r = internalSetting16;
        InternalSetting internalSetting17 = new InternalSetting("WSD_MEDIA", 16, "Aura Media button", "Add an option in the Aura settings that let the user use the media mode.");
        f39160s = internalSetting17;
        InternalSetting internalSetting18 = new InternalSetting("WSD_MOOD_LIGHT", 17, "Aura Mood light", "Add an option in the Aura settings that let the user change the light's color");
        f39161t = internalSetting18;
        InternalSetting internalSetting19 = new InternalSetting("FORCE_CONSENT_AT_LOGIN", 18, "Force consent at login", "Force to display the consent screen of user CGU");
        f39162u = internalSetting19;
        InternalSetting internalSetting20 = new InternalSetting("CHRISTMAS", 19, "Christmas", "Enable christmas theme snowflakes in home background");
        InternalSetting internalSetting21 = new InternalSetting("HIDE_HWA10_E_LABELS", 20, "Hide HWA10 E-Labels", "When enabled, e-label for hwa10 will be hidden. This feature is mainly needed for studies");
        f39163v = internalSetting21;
        InternalSetting internalSetting22 = new InternalSetting("FEATURE_FLAGS_IN_LOGIN", 21, "Show feature flags in login", "");
        f39164w = internalSetting22;
        InternalSetting[] internalSettingArr = {internalSetting, internalSetting2, internalSetting3, internalSetting4, internalSetting5, internalSetting6, internalSetting7, internalSetting8, internalSetting9, internalSetting10, internalSetting11, internalSetting12, internalSetting13, internalSetting14, internalSetting15, internalSetting16, internalSetting17, internalSetting18, internalSetting19, internalSetting20, internalSetting21, internalSetting22};
        f39165x = internalSettingArr;
        b.a(internalSettingArr);
    }

    private InternalSetting(String str, int i11, String str2, String str3) {
        this.f39166a = str2;
        this.f39167b = str3;
    }

    public static InternalSetting valueOf(String str) {
        return (InternalSetting) Enum.valueOf(InternalSetting.class, str);
    }

    public static InternalSetting[] values() {
        return (InternalSetting[]) f39165x.clone();
    }

    @Override // xr.a
    public final FeatureFlagCategory a() {
        return this.f39169d;
    }

    @Override // xr.a
    public final String b() {
        return this.f39167b;
    }

    @Override // xr.a
    public final String getKey() {
        return this.f39168c;
    }

    @Override // xr.a
    public final String getTitle() {
        return this.f39166a;
    }
}
