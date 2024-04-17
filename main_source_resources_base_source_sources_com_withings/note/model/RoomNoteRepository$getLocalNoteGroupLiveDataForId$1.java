package com.withings.note.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.h;
import androidx.lifecycle.h0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
import qm0.d;
import ym0.l;
import ym0.p;
/* compiled from: RoomNoteRepository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withings/note/model/NoteGroup;", "noteGroup", "Landroidx/lifecycle/LiveData;", "invoke", "(Lcom/withings/note/model/NoteGroup;)Landroidx/lifecycle/LiveData;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class RoomNoteRepository$getLocalNoteGroupLiveDataForId$1 extends w implements l<NoteGroup, LiveData<NoteGroup>> {
    final /* synthetic */ RoomNoteRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RoomNoteRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/h0;", "Lcom/withings/note/model/NoteGroup;", "Lnm0/y;", "<anonymous>", "(Landroidx/lifecycle/h0;)V"}, k = 3, mv = {1, 9, 0})
    @e(c = "com.withings.note.model.RoomNoteRepository$getLocalNoteGroupLiveDataForId$1$1", f = "RoomNoteRepository.kt", l = {33}, m = "invokeSuspend")
    /* renamed from: com.withings.note.model.RoomNoteRepository$getLocalNoteGroupLiveDataForId$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends i implements p<h0<NoteGroup>, d<? super y>, Object> {
        final /* synthetic */ NoteGroup $noteGroup;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RoomNoteRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NoteGroup noteGroup, RoomNoteRepository roomNoteRepository, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$noteGroup = noteGroup;
            this.this$0 = roomNoteRepository;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$noteGroup, this.this$0, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // ym0.p
        public final Object invoke(h0<NoteGroup> h0Var, d<? super y> dVar) {
            return ((AnonymousClass1) create(h0Var, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            NoteGroup noteGroup;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                h0 h0Var = (h0) this.L$0;
                NoteGroup noteGroup2 = this.$noteGroup;
                if (noteGroup2 != null) {
                    noteGroup = this.this$0.attachNotesToGroup(noteGroup2);
                } else {
                    noteGroup = null;
                }
                this.label = 1;
                if (h0Var.emit(noteGroup, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomNoteRepository$getLocalNoteGroupLiveDataForId$1(RoomNoteRepository roomNoteRepository) {
        super(1);
        this.this$0 = roomNoteRepository;
    }

    @Override // ym0.l
    public final LiveData<NoteGroup> invoke(NoteGroup noteGroup) {
        return h.a(Dispatchers.getIO(), new AnonymousClass1(noteGroup, this.this$0, null), 2);
    }
}
