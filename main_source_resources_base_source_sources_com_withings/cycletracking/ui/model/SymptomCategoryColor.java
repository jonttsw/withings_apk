package com.withings.cycletracking.ui.model;

import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SymptomUi.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/cycletracking/ui/model/SymptomCategoryColor;", "", "a", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SymptomCategoryColor {

    /* renamed from: d  reason: collision with root package name */
    public static final a f35696d;

    /* renamed from: e  reason: collision with root package name */
    public static final SymptomCategoryColor f35697e;

    /* renamed from: f  reason: collision with root package name */
    public static final SymptomCategoryColor f35698f;

    /* renamed from: g  reason: collision with root package name */
    public static final SymptomCategoryColor f35699g;

    /* renamed from: h  reason: collision with root package name */
    public static final SymptomCategoryColor f35700h;

    /* renamed from: i  reason: collision with root package name */
    public static final SymptomCategoryColor f35701i;

    /* renamed from: j  reason: collision with root package name */
    private static final /* synthetic */ SymptomCategoryColor[] f35702j;

    /* renamed from: a  reason: collision with root package name */
    private final int f35703a;

    /* renamed from: b  reason: collision with root package name */
    private final int f35704b;

    /* renamed from: c  reason: collision with root package name */
    private final int f35705c;

    /* compiled from: SymptomUi.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static SymptomCategoryColor a(Integer num) {
            if (num != null && num.intValue() == 3) {
                return SymptomCategoryColor.f35697e;
            }
            if (num != null && num.intValue() == 1) {
                return SymptomCategoryColor.f35698f;
            }
            if (num != null && num.intValue() == 2) {
                return SymptomCategoryColor.f35699g;
            }
            if (num != null && num.intValue() == 4) {
                return SymptomCategoryColor.f35700h;
            }
            return SymptomCategoryColor.f35701i;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.withings.cycletracking.ui.model.SymptomCategoryColor$a] */
    static {
        SymptomCategoryColor symptomCategoryColor = new SymptomCategoryColor("SymptomCategory", 0, C1987R.color.categorySymptomsIcon, C1987R.color.categorySymptomsBackgroundCard, C1987R.color.categorySymptomsBackgroundCardPressed);
        f35697e = symptomCategoryColor;
        SymptomCategoryColor symptomCategoryColor2 = new SymptomCategoryColor("MoodCategory", 1, C1987R.color.categoryMindfulnessIcon, C1987R.color.categoryMindfulnessBackgroundCard, C1987R.color.categoryMindfulnessBackgroundCardPressed);
        f35698f = symptomCategoryColor2;
        SymptomCategoryColor symptomCategoryColor3 = new SymptomCategoryColor("SexualCategory", 2, C1987R.color.categorySexualhealthIcon, C1987R.color.categorySexualhealthBackgroundCard, C1987R.color.categorySexualhealthBackgroundCardPressed);
        f35699g = symptomCategoryColor3;
        SymptomCategoryColor symptomCategoryColor4 = new SymptomCategoryColor("CervicalMucusCategory", 3, C1987R.color.categorySexualhealthIcon, C1987R.color.categorySexualhealthBackgroundCard, C1987R.color.categorySexualhealthBackgroundCardPressed);
        f35700h = symptomCategoryColor4;
        SymptomCategoryColor symptomCategoryColor5 = new SymptomCategoryColor("OtherCategory", 4, C1987R.color.categorySymptomsIcon, C1987R.color.categorySymptomsBackgroundCard, C1987R.color.categorySymptomsBackgroundCardPressed);
        f35701i = symptomCategoryColor5;
        SymptomCategoryColor[] symptomCategoryColorArr = {symptomCategoryColor, symptomCategoryColor2, symptomCategoryColor3, symptomCategoryColor4, symptomCategoryColor5};
        f35702j = symptomCategoryColorArr;
        b.a(symptomCategoryColorArr);
        f35696d = new Object();
    }

    private SymptomCategoryColor(String str, int i11, int i12, int i13, int i14) {
        this.f35703a = i12;
        this.f35704b = i13;
        this.f35705c = i14;
    }

    public static SymptomCategoryColor valueOf(String str) {
        return (SymptomCategoryColor) Enum.valueOf(SymptomCategoryColor.class, str);
    }

    public static SymptomCategoryColor[] values() {
        return (SymptomCategoryColor[]) f35702j.clone();
    }

    public final int a() {
        return this.f35704b;
    }

    public final int b() {
        return this.f35705c;
    }

    public final int d() {
        return this.f35703a;
    }
}
