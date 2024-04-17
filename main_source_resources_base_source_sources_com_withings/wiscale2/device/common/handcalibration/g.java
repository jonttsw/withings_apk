package com.withings.wiscale2.device.common.handcalibration;

import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HandsCalibrationPresenter.kt */
/* loaded from: classes5.dex */
public final class g extends w implements p<HandsCalibrationConversation, Exception, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f52711a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar) {
        super(2);
        this.f52711a = fVar;
    }

    @Override // ym0.p
    public final y invoke(HandsCalibrationConversation handsCalibrationConversation, Exception exc) {
        HandsCalibrationConversation conversation = handsCalibrationConversation;
        Exception exception = exc;
        u.j(conversation, "conversation");
        u.j(exception, "exception");
        f.a(this.f52711a, conversation, exception);
        return y.f85009a;
    }
}
