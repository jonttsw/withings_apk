package com.withings.weight.ui.segmentalBodyCompositionScreen.model;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BodyPartInfoCard.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/withings/weight/ui/segmentalBodyCompositionScreen/model/BodyPartInfoCard$State", "", "Lcom/withings/weight/ui/segmentalBodyCompositionScreen/model/BodyPartInfoCard$State;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BodyPartInfoCard$State {

    /* renamed from: a  reason: collision with root package name */
    public static final BodyPartInfoCard$State f47771a;

    /* renamed from: b  reason: collision with root package name */
    public static final BodyPartInfoCard$State f47772b;

    /* renamed from: c  reason: collision with root package name */
    public static final BodyPartInfoCard$State f47773c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ BodyPartInfoCard$State[] f47774d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.weight.ui.segmentalBodyCompositionScreen.model.BodyPartInfoCard$State] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.weight.ui.segmentalBodyCompositionScreen.model.BodyPartInfoCard$State] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.weight.ui.segmentalBodyCompositionScreen.model.BodyPartInfoCard$State] */
    static {
        ?? r02 = new Enum("Expended", 0);
        f47771a = r02;
        ?? r12 = new Enum("Collapsed", 1);
        f47772b = r12;
        ?? r22 = new Enum("Fixed", 2);
        f47773c = r22;
        BodyPartInfoCard$State[] bodyPartInfoCard$StateArr = {r02, r12, r22};
        f47774d = bodyPartInfoCard$StateArr;
        b.a(bodyPartInfoCard$StateArr);
    }

    private BodyPartInfoCard$State() {
        throw null;
    }

    public static BodyPartInfoCard$State valueOf(String str) {
        return (BodyPartInfoCard$State) Enum.valueOf(BodyPartInfoCard$State.class, str);
    }

    public static BodyPartInfoCard$State[] values() {
        return (BodyPartInfoCard$State[]) f47774d.clone();
    }
}
