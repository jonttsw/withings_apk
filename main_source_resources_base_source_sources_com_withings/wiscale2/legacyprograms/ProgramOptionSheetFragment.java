package com.withings.wiscale2.legacyprograms;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.media3.ui.h;
import com.google.android.material.bottomsheet.l;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import m0.t;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
/* compiled from: ProgramOptionSheetFragment.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001e\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/withings/wiscale2/legacyprograms/ProgramOptionSheetFragment;", "Lcom/google/android/material/bottomsheet/l;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Lnm0/y;", "showDialog", "(Landroid/content/Context;)V", "leaveProgram", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "dialog", "", XHTMLText.STYLE, "setupDialog", "(Landroid/app/Dialog;I)V", "", NavigationArguments.USER_ID, "J", NavigationArguments.PROGRAM_ID, "I", "Lcom/withings/views/widget/LineCellView;", "leaveView", "Lcom/withings/views/widget/LineCellView;", "Landroid/app/ProgressDialog;", "progressDialog", "Landroid/app/ProgressDialog;", "<init>", "Companion", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ProgramOptionSheetFragment extends l {
    private static final String EXTRA_PROGRAM_ID = "program_id";
    private static final String EXTRA_USER_ID = "user_id";
    private LineCellView leaveView;
    private int programId;
    private ProgressDialog progressDialog;
    private long userId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ProgramOptionSheetFragment.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/ProgramOptionSheetFragment$Companion;", "", "()V", "EXTRA_PROGRAM_ID", "", "EXTRA_USER_ID", "newInstance", "Lcom/withings/wiscale2/legacyprograms/ProgramOptionSheetFragment;", NavigationArguments.USER_ID, "", NavigationArguments.PROGRAM_ID, "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final ProgramOptionSheetFragment newInstance(long j5, int i11) {
            ProgramOptionSheetFragment programOptionSheetFragment = new ProgramOptionSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", j5);
            bundle.putInt(ProgramOptionSheetFragment.EXTRA_PROGRAM_ID, i11);
            programOptionSheetFragment.setArguments(bundle);
            return programOptionSheetFragment;
        }

        private Companion() {
        }
    }

    private final void leaveProgram() {
        ProgressDialog show = ProgressDialog.show(getActivity(), null, getString(C1987R.string._LOADING_));
        u.i(show, "show(...)");
        this.progressDialog = show;
        show.setCancelable(false);
        BuildersKt__Builders_commonKt.launch$default(t.l(this), null, null, new ProgramOptionSheetFragment$leaveProgram$1(this, null), 3, null);
    }

    public static final void setupDialog$lambda$1(ProgramOptionSheetFragment this$0, View view) {
        u.j(this$0, "this$0");
        Context context = view.getContext();
        u.i(context, "getContext(...)");
        this$0.showDialog(context);
    }

    private final void showDialog(Context context) {
        qc.b bVar = new qc.b(context);
        bVar.g(C1987R.string._PROGRAM_LEAVE_CONFIRMATION_);
        qc.b w11 = bVar.z(C1987R.string._YES_, new DialogInterface.OnClickListener() { // from class: com.withings.wiscale2.legacyprograms.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                ProgramOptionSheetFragment.showDialog$lambda$2(ProgramOptionSheetFragment.this, dialogInterface, i11);
            }
        }).w(C1987R.string._NO_, new bf0.a(1));
        w11.t(true);
        w11.s();
    }

    public static final void showDialog$lambda$2(ProgramOptionSheetFragment this$0, DialogInterface dialogInterface, int i11) {
        u.j(this$0, "this$0");
        this$0.leaveProgram();
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle a11 = yq.b.a(this);
        this.userId = a11.getLong("user_id");
        this.programId = a11.getInt(EXTRA_PROGRAM_ID);
    }

    @Override // androidx.appcompat.app.u, androidx.fragment.app.m
    public void setupDialog(Dialog dialog, int i11) {
        u.j(dialog, "dialog");
        super.setupDialog(dialog, i11);
        View inflate = View.inflate(getContext(), C1987R.layout.dialog_wellness_program, null);
        dialog.setContentView(inflate);
        View findViewById = inflate.findViewById(C1987R.id.dialog_wellness_program_leave);
        u.i(findViewById, "findViewById(...)");
        LineCellView lineCellView = (LineCellView) findViewById;
        this.leaveView = lineCellView;
        lineCellView.setOnClickListener(new h(this, 18));
    }
}
