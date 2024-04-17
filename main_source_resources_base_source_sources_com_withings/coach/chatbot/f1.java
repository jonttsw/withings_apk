package com.withings.coach.chatbot;

import android.content.Context;
import com.withings.wiscale2.C1987R;
/* compiled from: UserResponseFormatController.kt */
/* loaded from: classes3.dex */
public final class f1 implements u0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f32991a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f32992b;

    public f1(Context context, String value) {
        kotlin.jvm.internal.u.j(value, "value");
        kotlin.jvm.internal.u.j(context, "context");
        this.f32991a = value;
        this.f32992b = context;
    }

    @Override // com.withings.coach.chatbot.u0
    public final String a() {
        String string = this.f32992b.getString(C1987R.string.coachConversation_inputValidation_maxError, this.f32991a);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        return string;
    }

    @Override // com.withings.coach.chatbot.u0
    public final boolean b(String inputValue) {
        kotlin.jvm.internal.u.j(inputValue, "inputValue");
        if (dp0.j.f0(inputValue) == null || Float.parseFloat(inputValue) > Float.parseFloat(this.f32991a)) {
            return false;
        }
        return true;
    }
}
