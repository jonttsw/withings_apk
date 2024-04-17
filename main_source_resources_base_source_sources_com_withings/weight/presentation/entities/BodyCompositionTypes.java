package com.withings.weight.presentation.entities;

import com.withings.weight.presentation.entities.BodyCompGraphTags;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BodyCompositionTypes.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/weight/presentation/entities/BodyCompositionTypes;", "", "weight-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BodyCompositionTypes {

    /* renamed from: e  reason: collision with root package name */
    public static final BodyCompositionTypes f47107e;

    /* renamed from: f  reason: collision with root package name */
    public static final BodyCompositionTypes f47108f;

    /* renamed from: g  reason: collision with root package name */
    public static final BodyCompositionTypes f47109g;

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ BodyCompositionTypes[] f47110h;

    /* renamed from: a  reason: collision with root package name */
    private final int f47111a;

    /* renamed from: b  reason: collision with root package name */
    private final int f47112b;

    /* renamed from: c  reason: collision with root package name */
    private final BodyCompGraphTags.MassGraphs f47113c;

    /* renamed from: d  reason: collision with root package name */
    private final BodyCompGraphTags.NormalityZones f47114d;

    static {
        BodyCompositionTypes bodyCompositionTypes = new BodyCompositionTypes("FAT", 0, C1987R.color.datavizDiverging9, C1987R.color.datavizDiverging8, BodyCompGraphTags.MassGraphs.f47095b, BodyCompGraphTags.NormalityZones.f47101b);
        f47107e = bodyCompositionTypes;
        BodyCompositionTypes bodyCompositionTypes2 = new BodyCompositionTypes("MUSCLE", 1, C1987R.color.datavizDiverging2, C1987R.color.datavizDiverging4, BodyCompGraphTags.MassGraphs.f47096c, BodyCompGraphTags.NormalityZones.f47102c);
        f47108f = bodyCompositionTypes2;
        BodyCompositionTypes bodyCompositionTypes3 = new BodyCompositionTypes("BONE", 2, C1987R.color.datavizMonochromaticGhost5, C1987R.color.datavizMonochromaticGhost2, BodyCompGraphTags.MassGraphs.f47097d, BodyCompGraphTags.NormalityZones.f47103d);
        f47109g = bodyCompositionTypes3;
        BodyCompositionTypes[] bodyCompositionTypesArr = {bodyCompositionTypes, bodyCompositionTypes2, bodyCompositionTypes3};
        f47110h = bodyCompositionTypesArr;
        b.a(bodyCompositionTypesArr);
    }

    private BodyCompositionTypes(String str, int i11, int i12, int i13, BodyCompGraphTags.MassGraphs massGraphs, BodyCompGraphTags.NormalityZones normalityZones) {
        this.f47111a = i12;
        this.f47112b = i13;
        this.f47113c = massGraphs;
        this.f47114d = normalityZones;
    }

    public static BodyCompositionTypes valueOf(String str) {
        return (BodyCompositionTypes) Enum.valueOf(BodyCompositionTypes.class, str);
    }

    public static BodyCompositionTypes[] values() {
        return (BodyCompositionTypes[]) f47110h.clone();
    }

    public final int a() {
        return this.f47111a;
    }

    public final BodyCompGraphTags.MassGraphs b() {
        return this.f47113c;
    }

    public final BodyCompGraphTags.NormalityZones d() {
        return this.f47114d;
    }

    public final int e() {
        return this.f47112b;
    }
}
