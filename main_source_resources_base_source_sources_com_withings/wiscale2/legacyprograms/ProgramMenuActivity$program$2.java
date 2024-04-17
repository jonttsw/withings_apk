package com.withings.wiscale2.legacyprograms;

import android.content.Intent;
import android.os.Build;
import com.withings.programs.model.ProgramOld;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: ProgramMenuActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/withings/programs/model/ProgramOld;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ProgramMenuActivity$program$2 extends w implements ym0.a<ProgramOld> {
    final /* synthetic */ ProgramMenuActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgramMenuActivity$program$2(ProgramMenuActivity programMenuActivity) {
        super(0);
        this.this$0 = programMenuActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final ProgramOld invoke() {
        Object obj;
        Intent intent = this.this$0.getIntent();
        u.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT < 33) {
            Serializable serializableExtra = intent.getSerializableExtra(ProgramMenuActivity.EXTRA_KEY_PROGRAM);
            if (!(serializableExtra instanceof ProgramOld)) {
                serializableExtra = null;
            }
            obj = (ProgramOld) serializableExtra;
        } else {
            obj = intent.getSerializableExtra(ProgramMenuActivity.EXTRA_KEY_PROGRAM, ProgramOld.class);
        }
        u.g(obj);
        return (ProgramOld) obj;
    }
}
