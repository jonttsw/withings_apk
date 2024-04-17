package com.withings.device.details.elabel;

import com.withings.device.details.elabel.LabeledDeviceModel;
import kotlin.jvm.internal.w;
import nm0.y;
import on.k;
import ym0.p;
/* compiled from: ElabelDeviceActivity.kt */
/* loaded from: classes3.dex */
final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ElabelDeviceActivity f36811a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ElabelDeviceActivity elabelDeviceActivity) {
        super(2);
        this.f36811a = elabelDeviceActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        LabeledDeviceModel labeledDeviceModel;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            ElabelDeviceActivity elabelDeviceActivity = this.f36811a;
            a aVar3 = new a(elabelDeviceActivity);
            LabeledDeviceModel.a aVar4 = LabeledDeviceModel.f36799a;
            int modelId = ElabelDeviceActivity.z3(elabelDeviceActivity).getModelId();
            aVar4.getClass();
            if (modelId != 10) {
                if (modelId != 63) {
                    if (modelId != 91) {
                        if (modelId != 93) {
                            if (modelId == 94) {
                                labeledDeviceModel = LabeledDeviceModel.f36802d;
                            } else {
                                throw new Exception("Non-labeled device");
                            }
                        } else {
                            labeledDeviceModel = LabeledDeviceModel.f36801c;
                        }
                    } else {
                        labeledDeviceModel = LabeledDeviceModel.f36800b;
                    }
                } else {
                    labeledDeviceModel = LabeledDeviceModel.f36804f;
                }
            } else {
                labeledDeviceModel = LabeledDeviceModel.f36803e;
            }
            k.a(aVar3, labeledDeviceModel, aVar2, 0);
        }
        return y.f85009a;
    }
}
