# Bob Wordcloud

A [Bob the Build Tool](https://github.com/codemonstur/bobthebuildtool) plugin that generates a word cloud image from the words found in a project's Java source files.

[![GitHub Release](https://img.shields.io/github/release/codemonstur/bobplugin-wordcloud.svg)](https://github.com/codemonstur/bobplugin-wordcloud/releases)
[![MIT Licence](https://badges.frapsoft.com/os/mit/mit.svg?v=103)](https://opensource.org/licenses/mit-license.php)

## Features

- Scans all `.java` source files of a Bob project.
- Counts word frequencies (case-insensitive, non-alphanumeric characters treated as separators).
- Renders a circular word cloud (`wordcloud.png` by default) using a blue colour palette.

## Requirements

- Java 17 or newer
- [Bob the Build Tool](https://github.com/codemonstur/bobthebuildtool) 5 or newer

## Installation

Add this line to the top of your `bobfile`:

```
plugin codemonstur/bobplugin-wordcloud:3
```

The `wordcloud` command is then available in all your bob tasks.

Or build the jar manually:

```sh
mvn -DskipTests clean package
```

## Usage

Run the plugin from within a Bob project:

```sh
bob wordcloud [options]
```

### Options

| Option | Long form | Description | Default |
|---|---|---|---|
| `-t` | `--target` | Target directory to write the image to | project build target |
| `-o` | `--output` | Output file name | `wordcloud.png` |

### Example

Generate a word cloud in the project's build target directory:

```sh
bob wordcloud
```

Write it to a custom location:

```sh
bob wordcloud -t /tmp -o mycloud.png
```

## Building

```sh
make build       # compile and package (skips tests)
make test        # run tests
make coverage    # run tests with JaCoCo coverage report
make validate    # check dependency versions, cves, licenses, and code quality
```

## Project structure

```
src/main/java/wordcloud/
  BobPlugin.java          # plugin entry point
  WordCloudCommand.java   # word cloud generation logic
```

## License

Released under the [MIT License](https://opensource.org/licenses/MIT).
