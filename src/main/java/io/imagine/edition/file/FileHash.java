package io.imagine.edition.file;

import io.imagine.edition.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
