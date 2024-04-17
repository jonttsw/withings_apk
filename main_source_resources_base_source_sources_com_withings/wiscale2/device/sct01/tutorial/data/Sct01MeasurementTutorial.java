package com.withings.wiscale2.device.sct01.tutorial.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.tutorial.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import vc0.e;
import vc0.f;
/* compiled from: Sct01MeasurementTutorial.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/device/sct01/tutorial/data/Sct01MeasurementTutorial;", "Lvc0/e;", "Landroid/os/Parcelable;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Sct01MeasurementTutorial implements e, Parcelable {
    public static final Parcelable.Creator<Sct01MeasurementTutorial> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final int f54801a;

    /* renamed from: b  reason: collision with root package name */
    private final f f54802b;

    /* renamed from: c  reason: collision with root package name */
    private final f f54803c;

    /* renamed from: d  reason: collision with root package name */
    private final f f54804d;

    /* renamed from: e  reason: collision with root package name */
    private final f f54805e;

    /* renamed from: f  reason: collision with root package name */
    private final f f54806f;

    /* renamed from: g  reason: collision with root package name */
    private final f f54807g;

    /* renamed from: h  reason: collision with root package name */
    private final f f54808h;

    /* renamed from: i  reason: collision with root package name */
    private final f f54809i;

    /* renamed from: j  reason: collision with root package name */
    private final h f54810j;

    /* renamed from: k  reason: collision with root package name */
    private final h f54811k;

    /* renamed from: l  reason: collision with root package name */
    private final List<h> f54812l;

    /* renamed from: m  reason: collision with root package name */
    private final ArrayList f54813m;

    /* compiled from: Sct01MeasurementTutorial.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Sct01MeasurementTutorial> {
        @Override // android.os.Parcelable.Creator
        public final Sct01MeasurementTutorial createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            return new Sct01MeasurementTutorial(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Sct01MeasurementTutorial[] newArray(int i11) {
            return new Sct01MeasurementTutorial[i11];
        }
    }

    public Sct01MeasurementTutorial(int i11) {
        int i12;
        int i13;
        int i14;
        this.f54801a = i11;
        f fVar = new f(C1987R.string.temperatureMeasurement_tutorial_removeCap_title, Integer.valueOf((int) C1987R.string._TM_SCT01_TUTO_INTRODUCTION_), 2131232777, Integer.valueOf((int) C1987R.string.temperatureMeasurement_tutorial_removeCap_videoUrl));
        this.f54802b = fVar;
        f fVar2 = new f(C1987R.string.temperatureMeasurement_tutorial_turnOn_title, Integer.valueOf((int) C1987R.string.temperatureMeasurement_tutorial_turnOn_message), 2131232786, Integer.valueOf((int) C1987R.string.temperatureMeasurement_tutorial_turnOn_videoUrl));
        this.f54803c = fVar2;
        f fVar3 = new f(C1987R.string.temperatureMeasurement_tutorial_scanForehead_title, Integer.valueOf((int) C1987R.string.temperatureMeasurement_tutorial_scanForehead_message), 2131232783, Integer.valueOf((int) C1987R.string.temperatureMeasurement_tutorial_scanForehead_videoUrl));
        this.f54804d = fVar3;
        f fVar4 = new f(C1987R.string.temperatureMeasurement_tutorial_arteryExplanation_title, Integer.valueOf((int) C1987R.string.temperatureMeasurement_tutorial_arteryExplanation_message), 2131232776, Integer.valueOf((int) C1987R.string.temperatureMeasurement_tutorial_arteryExplanation_videoUrl));
        this.f54805e = fVar4;
        f fVar5 = new f(C1987R.string.temperatureMeasurement_tutorial_startGesture_title, Integer.valueOf((int) C1987R.string.temperatureMeasurement_tutorial_startGesture_message), 2131232785, Integer.valueOf((int) C1987R.string.temperatureMeasurement_tutorial_startGesture_videoUrl));
        this.f54806f = fVar5;
        f fVar6 = new f(C1987R.string.temperatureMeasurement_tutorial_endGesture_title, Integer.valueOf((int) C1987R.string.temperatureMeasurement_tutorial_endGesture_message), 2131232778, Integer.valueOf((int) C1987R.string.temperatureMeasurement_tutorial_endGesture_videoUrl));
        this.f54807g = fVar6;
        Integer valueOf = Integer.valueOf((int) C1987R.string.temperatureMeasurement_tutorial_slideToAssign_message);
        if (i11 == 13) {
            i12 = C1987R.string.temperatureMeasurement_tutorial_slideToAssign_fahrenheit_videoUrl;
        } else {
            i12 = C1987R.string.temperatureMeasurement_tutorial_slideToAssign_celsius_videoUrl;
        }
        f fVar7 = new f(C1987R.string.temperatureMeasurement_tutorial_slideToAssign_title, valueOf, 2131232784, Integer.valueOf(i12));
        this.f54808h = fVar7;
        Integer valueOf2 = Integer.valueOf((int) C1987R.string.temperatureMeasurement_tutorial_pressToAssign_message);
        if (i11 == 13) {
            i13 = C1987R.string.temperatureMeasurement_tutorial_pressToAssign_fahrenheit_videoUrl;
        } else {
            i13 = C1987R.string.temperatureMeasurement_tutorial_pressToAssign_celsius_videoUrl;
        }
        f fVar8 = new f(C1987R.string._TM_SCT01_TUTO_ASSIGN_VALIDATION_, valueOf2, 2131232781, Integer.valueOf(i13));
        this.f54809i = fVar8;
        h hVar = new h(C1987R.string.temperatureMeasurement_tutorial_results_title, Integer.valueOf((int) C1987R.string.temperatureMeasurement_tutorial_results_message), 2131232782, null, 56);
        this.f54810j = hVar;
        if (i11 == 13) {
            i14 = 2131232780;
        } else {
            i14 = 2131232779;
        }
        h hVar2 = new h(C1987R.string.temperatureMeasurement_tutorial_finalTips_title, null, Integer.valueOf(i14), null, 58);
        this.f54811k = hVar2;
        List<h> W = x.W(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, hVar, hVar2);
        this.f54812l = W;
        ArrayList arrayList = new ArrayList();
        for (Object obj : W) {
            if (obj instanceof f) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer j5 = ((f) it.next()).j();
            if (j5 != null) {
                arrayList2.add(j5);
            }
        }
        this.f54813m = arrayList2;
    }

    @Override // vc0.e
    public final ArrayList a() {
        return this.f54813m;
    }

    @Override // vc0.b
    public final List<h> b() {
        return this.f54812l;
    }

    public final f c() {
        return this.f54805e;
    }

    public final f d() {
        return this.f54802b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final f e() {
        return this.f54807g;
    }

    public final h f() {
        return this.f54811k;
    }

    public final f g() {
        return this.f54809i;
    }

    public final h h() {
        return this.f54810j;
    }

    public final f i() {
        return this.f54804d;
    }

    public final f j() {
        return this.f54808h;
    }

    public final f k() {
        return this.f54806f;
    }

    public final f l() {
        return this.f54803c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeInt(this.f54801a);
    }
}
