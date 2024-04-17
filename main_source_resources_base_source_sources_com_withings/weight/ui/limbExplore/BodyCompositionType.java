package com.withings.weight.ui.limbExplore;

import com.withings.weight.ui.limbExplore.BodyCompGraphTags;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BodyCompositionType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/weight/ui/limbExplore/BodyCompositionType;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BodyCompositionType {

    /* renamed from: d  reason: collision with root package name */
    public static final BodyCompositionType f47634d;

    /* renamed from: e  reason: collision with root package name */
    public static final BodyCompositionType f47635e;

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ BodyCompositionType[] f47636f;

    /* renamed from: a  reason: collision with root package name */
    private final int f47637a;

    /* renamed from: b  reason: collision with root package name */
    private final int f47638b;

    /* renamed from: c  reason: collision with root package name */
    private final BodyCompGraphTags.MassGraphs f47639c;

    static {
        BodyCompositionType bodyCompositionType = new BodyCompositionType("FAT", 0, C1987R.color.datavizDiverging9, C1987R.color.datavizDiverging8, BodyCompGraphTags.MassGraphs.f47629b);
        f47634d = bodyCompositionType;
        BodyCompositionType bodyCompositionType2 = new BodyCompositionType("MUSCLE", 1, C1987R.color.datavizDiverging2, C1987R.color.datavizDiverging4, BodyCompGraphTags.MassGraphs.f47630c);
        f47635e = bodyCompositionType2;
        BodyCompositionType[] bodyCompositionTypeArr = {bodyCompositionType, bodyCompositionType2};
        f47636f = bodyCompositionTypeArr;
        sm0.b.a(bodyCompositionTypeArr);
    }

    private BodyCompositionType(String str, int i11, int i12, int i13, BodyCompGraphTags.MassGraphs massGraphs) {
        this.f47637a = i12;
        this.f47638b = i13;
        this.f47639c = massGraphs;
    }

    public static BodyCompositionType valueOf(String str) {
        return (BodyCompositionType) Enum.valueOf(BodyCompositionType.class, str);
    }

    public static BodyCompositionType[] values() {
        return (BodyCompositionType[]) f47636f.clone();
    }

    public final int a() {
        return this.f47637a;
    }

    public final BodyCompGraphTags.MassGraphs b() {
        return this.f47639c;
    }

    public final int d() {
        return this.f47638b;
    }
}
