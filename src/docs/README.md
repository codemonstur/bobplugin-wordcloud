# bobplugin-wordcloud

A [bob](https://github.com/codemonstur/bobthebuildtool) plugin that scans your
Java sources, counts word frequencies, and renders a circular blue word cloud to
a PNG image — a quick visual sense of what a codebase talks about.

## Requirements

- Java 17+
- bob 5+

## Installation

```
plugin codemonstur/wordcloud:<version>
```

## Usage

```
bob wordcloud [options]
```

| Option | Default | Description |
| --- | --- | --- |
| `-t`, `--target` | — | Source directory (or directories) to scan. |
| `-o`, `--output` | `wordcloud.png` | Output PNG path. |

### Example

```sh
bob wordcloud -t src/main/java -o target/wordcloud.png
```

## How it works

1. Walks the target directories for `.java` files.
2. Tokenizes case-insensitively, splitting on non-alphanumeric characters.
3. Builds a [kumo](https://github.com/kennyc1014/kumo) `WordCloud` with a
   `CircleBackground`, `SqrtFontScalar`, and a blue `ColorPalette`.
4. Writes the PNG.

## Building

```sh
make build
```

## License

MIT
