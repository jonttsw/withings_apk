package com.withings.note.model;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.withings.user.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NoteLiveData.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.note.model.NoteLiveData$saveNote$1", f = "NoteLiveData.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NoteLiveData$saveNote$1 extends i implements p<CoroutineScope, d<? super y>, Object> {
    final /* synthetic */ String $note;
    int label;
    final /* synthetic */ NoteLiveData this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteLiveData$saveNote$1(NoteLiveData noteLiveData, String str, d<? super NoteLiveData$saveNote$1> dVar) {
        super(2, dVar);
        this.this$0 = noteLiveData;
        this.$note = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new NoteLiveData$saveNote$1(this.this$0, this.$note, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        m70.i iVar;
        long j5;
        LiveData liveData;
        NoteRepository noteRepository;
        Context context;
        LiveData liveData2;
        List list;
        ky.d dVar;
        NoteRepository noteRepository2;
        Context context2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            iVar = this.this$0.userManager;
            j5 = this.this$0.userId;
            User i11 = iVar.i(j5);
            liveData = this.this$0.noteGroup;
            NoteGroup noteGroup = (NoteGroup) liveData.getValue();
            if (this.$note.length() == 0) {
                if (noteGroup != null) {
                    NoteLiveData noteLiveData = this.this$0;
                    noteRepository2 = noteLiveData.noteRepository;
                    context2 = noteLiveData.context;
                    u.g(i11);
                    noteRepository2.deleteNoteGroupAndSync(context2, i11, noteGroup);
                }
            } else {
                if (noteGroup == null) {
                    liveData2 = this.this$0.groups;
                    if (liveData2 != null && (list = (List) liveData2.getValue()) != null && (dVar = (ky.d) x.K(list)) != null) {
                        noteGroup = NoteGroupKt.createNoteGroup(dVar);
                    } else {
                        noteGroup = null;
                    }
                }
                if (noteGroup != null) {
                    String str = this.$note;
                    NoteLiveData noteLiveData2 = this.this$0;
                    NoteGroupKt.addNoteText(noteGroup, str);
                    noteRepository = noteLiveData2.noteRepository;
                    context = noteLiveData2.context;
                    u.g(i11);
                    noteRepository.insertOrUpdateNoteGroupAndSync(context, i11, noteGroup);
                }
            }
            return y.f85009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((NoteLiveData$saveNote$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
