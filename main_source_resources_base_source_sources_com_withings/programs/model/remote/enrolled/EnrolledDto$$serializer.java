package com.withings.programs.model.remote.enrolled;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/* compiled from: EnrolledDto.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/programs/model/remote/enrolled/EnrolledDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/programs/model/remote/enrolled/EnrolledDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/programs/model/remote/enrolled/EnrolledDto;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/programs/model/remote/enrolled/EnrolledDto;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class EnrolledDto$$serializer implements GeneratedSerializer<EnrolledDto> {
    public static final EnrolledDto$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        EnrolledDto$$serializer enrolledDto$$serializer = new EnrolledDto$$serializer();
        INSTANCE = enrolledDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.programs.model.remote.enrolled.EnrolledDto", enrolledDto$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("enrolledDetailDto", false);
        pluginGeneratedSerialDescriptor.addElement("iterationDtoList", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EnrolledDto$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = EnrolledDto.$childSerializers;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(EnrolledDetailDto$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(kSerializerArr[1])};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public EnrolledDto deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        List list;
        EnrolledDetailDto enrolledDetailDto;
        int i11;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = EnrolledDto.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            enrolledDetailDto = (EnrolledDetailDto) beginStructure.decodeNullableSerializableElement(descriptor2, 0, EnrolledDetailDto$$serializer.INSTANCE, null);
            list = (List) beginStructure.decodeNullableSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            i11 = 3;
        } else {
            boolean z5 = true;
            int i12 = 0;
            List list2 = null;
            EnrolledDetailDto enrolledDetailDto2 = null;
            while (z5) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z5 = false;
                } else if (decodeElementIndex == 0) {
                    enrolledDetailDto2 = (EnrolledDetailDto) beginStructure.decodeNullableSerializableElement(descriptor2, 0, EnrolledDetailDto$$serializer.INSTANCE, enrolledDetailDto2);
                    i12 |= 1;
                } else if (decodeElementIndex != 1) {
                    throw new UnknownFieldException(decodeElementIndex);
                } else {
                    list2 = (List) beginStructure.decodeNullableSerializableElement(descriptor2, 1, kSerializerArr[1], list2);
                    i12 |= 2;
                }
            }
            list = list2;
            enrolledDetailDto = enrolledDetailDto2;
            i11 = i12;
        }
        beginStructure.endStructure(descriptor2);
        return new EnrolledDto(i11, enrolledDetailDto, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, EnrolledDto value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        EnrolledDto.write$Self$android_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
