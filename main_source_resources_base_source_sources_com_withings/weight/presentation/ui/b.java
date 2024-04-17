package com.withings.weight.presentation.ui;

import android.content.Context;
import com.withings.graph.decorator.i;
import com.withings.graph.model.NormalityZoneUiModel;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import m90.d;
import org.joda.time.DateTime;
/* compiled from: BodyCompMainGraphUiModelMapper.kt */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static final List<Integer> f47206b = kotlin.collections.x.W(8, 77, 76, 88);

    /* renamed from: a  reason: collision with root package name */
    private final Context f47207a;

    @Inject
    public b(Context context) {
        this.f47207a = context;
    }

    private static NormalityZoneUiModel b(boolean z5, NormalityZoneUiModel normalityZoneUiModel) {
        NormalityZoneUiModel.Status a11 = normalityZoneUiModel.a();
        NormalityZoneUiModel.Type b10 = normalityZoneUiModel.b();
        List<ws.d> c11 = normalityZoneUiModel.c();
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(c11, 10));
        for (ws.d dVar : c11) {
            arrayList.add(new ws.d(dVar.c(), dVar.a(), c(z5, dVar.c(), dVar.d(), dVar.e()), c(z5, dVar.c(), dVar.b(), dVar.e()), dVar.e()));
        }
        return new NormalityZoneUiModel(a11, arrayList, b10);
    }

    private static double c(boolean z5, int i11, double d11, double d12) {
        if (i11 != 22) {
            int abs = Math.abs(i11);
            if (z5) {
                if (f47206b.contains(Integer.valueOf(abs))) {
                    return (d11 * 100) / d12;
                }
                return d11;
            }
            return d11;
        }
        return d11;
    }

    public final m90.c a(f90.a initialGraphData, boolean z5, String axisUnit) {
        kotlin.jvm.internal.u.j(initialGraphData, "initialGraphData");
        kotlin.jvm.internal.u.j(axisUnit, "axisUnit");
        ArrayList arrayList = new ArrayList();
        for (ky.d dVar : initialGraphData.c()) {
            m90.d b10 = d.a.b(dVar);
            if (b10 != null) {
                arrayList.add(b10);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (ky.d dVar2 : initialGraphData.h()) {
            m90.d d11 = d.a.d(dVar2);
            if (d11 != null) {
                arrayList2.add(d11);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (ky.d dVar3 : initialGraphData.a()) {
            m90.d a11 = d.a.a(dVar3);
            if (a11 != null) {
                arrayList3.add(a11);
            }
        }
        om0.b bVar = new om0.b();
        boolean z11 = !arrayList2.isEmpty();
        Context context = this.f47207a;
        if (z11) {
            String string = context.getString(C1987R.string.muscle_legend_name);
            kotlin.jvm.internal.u.i(string, "getString(...)");
            bVar.add(new i.b(string, C1987R.drawable.legend_circle_datum_muscle_mass));
        }
        if (!arrayList.isEmpty()) {
            String string2 = context.getString(C1987R.string.fat_legend_name);
            kotlin.jvm.internal.u.i(string2, "getString(...)");
            bVar.add(new i.b(string2, C1987R.drawable.legend_circle_datum_fat_mass));
        }
        if (!arrayList3.isEmpty()) {
            String string3 = context.getString(C1987R.string.bone_legend_name);
            kotlin.jvm.internal.u.i(string3, "getString(...)");
            bVar.add(new i.b(string3, C1987R.drawable.legend_circle_datum_bone_mass));
        }
        om0.b t11 = bVar.t();
        DateTime f11 = initialGraphData.f();
        DateTime e11 = initialGraphData.e();
        List<NormalityZoneUiModel> d12 = initialGraphData.d();
        ArrayList arrayList4 = new ArrayList(kotlin.collections.x.y(d12, 10));
        for (NormalityZoneUiModel normalityZoneUiModel : d12) {
            arrayList4.add(b(z5, normalityZoneUiModel));
        }
        List<NormalityZoneUiModel> i11 = initialGraphData.i();
        ArrayList arrayList5 = new ArrayList(kotlin.collections.x.y(i11, 10));
        for (NormalityZoneUiModel normalityZoneUiModel2 : i11) {
            arrayList5.add(b(z5, normalityZoneUiModel2));
        }
        List<NormalityZoneUiModel> b11 = initialGraphData.b();
        ArrayList arrayList6 = new ArrayList(kotlin.collections.x.y(b11, 10));
        for (NormalityZoneUiModel normalityZoneUiModel3 : b11) {
            arrayList6.add(b(z5, normalityZoneUiModel3));
        }
        return new m90.c(arrayList, arrayList3, arrayList2, axisUnit, t11, z5, f11, e11, arrayList4, arrayList5, arrayList6);
    }
}
