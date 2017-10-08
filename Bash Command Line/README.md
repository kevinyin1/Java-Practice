

# General Bash Command Line:
- Basic review page of bash command line

## Navigation and Creation:
| COMMAND | DESCRIPTION |
| --- | ------------------------------------------------- |
| `pwd` | outputs the name of the current working directory |
| `ls` | lits all files and directories in the working directory |
| `cd` | switches you into the directory you specify |
| `cd ..` | switches you into the directory that is one chain up from the current working directory |
| `cd ../../` | switches you into the directory that is two chains up from the current working directory |
| `mkdir` | creates a new directory in the working directory |
| `touch` | creates a new file inside the working directory |

## Mainpulation:

### $ls:
| COMMAND | DESCRIPTION |
| --- | ------------------------------------------------- |
| `ls -a` | lists all contents of a directory, including hidden files and directories |
| `ls -l` | lists all contents in long format |
| `ls -t` | orders files and directories by the time they were last modified |
| `ls -al` | list all contents of a directory, including hidden files and directories, in long format |
| `ls -at` | list all contents of a directory, including hidden files and directories, ordered by the time they were last modified |
| `ls -lt` | list all contents of a directory, excluding hidden files and directories, ordered by the time they were last modified |
| `ls -alt` | lists all contents of a directory, including hiddne files and directories, odreded by the time they were last modified in long format |

### $cp:
| COMMAND | DESCRIPTION |
| --- | ------------------------------------------------- |
| `cp <INIT_FILE> <END_FILE>` | copies the contents of the INIT_FILE into the END_FILE |
| `cp <DIRECTORY/FILE_NAME> <DIRECTORY/FILE_NAME> .... <PASTE_DIRECTORY>/` | copies a single or multiple files and places it in the given directory. |
| `cp * <PASTE_DIRECTORY>/` | copies all the files in the working directory and pastes the files in the given directory (the asterisk is known as a wildcard) |
| `cp <ANY_CHARACTER>*.<FILE_TYPE> <PASTE_DIRECTORY>/`| copies all the files, in the working directory, that start with the given character and pastes it in the given directory. |

### $mv:
| COMMAND | DESCRIPTION |
| --- | ------------------------------------------------- |
| `mv <FILE_NAME> <FILE_NAME> <DESTINATION>/` | moves a single or multiple given files to the given directory |
| `mv <INIT_FILE_NAME> <NEW_FILE_NAME>` | moves the contents of the initial file to the new file and renames the new file's name to the given new file name |

### $rm:
| COMMAND | DESCRIPTION |
| --- | ------------------------------------------------- |
| `rm <FILE_NAME>` | deletes the given file |
| `rm -r <DIRECTORY_NAME>` | deletes the given directory | 

## Redirection:
| COMMAND | DESCRIPTION |
| --- | ------------------------------------------------- |
| `echo <ARGUEMENT>` | prints the arguement in the shell |
| `cat <FILE_NAME>` | prints the contents of the given file |
| `<COMMAND> > <FILE_NAME>` | redirects the standard output to a file |
| `<COMMAND> >> <FILE_NAME>` | appends the standard output to a file |
| `<COMMAND> < <FILE_NAME>` | takes the standard input from the right file and inputs it into the program on the left |
| `<COMMAND>`<code>&#124;</code>`<COMMAND>` | this is a **pipe**. The <code>&#124;</code> takes the standard output of the left and pipes it as a standard input to the right |
| `<COMMAND> <FILE_NAME>`<code>&#124;</code>`wc` | respectively outputs the number of lines, words and characters |
| `sort <FILE_NAME>` | sorts the contents of the given file |
| `uniq <FILE_NAME>` | remove duplicates in the contents of the given file |
| `greg <ARGUEMENT> <FILE_NAME OR DIRECTORY_NAME>` | searches files for the lines or file names that match the given argument and returns the result |
| `greg -i <ARGUMENT> <FILE_NAME OR DIRECTORY_NAME>` | searches files for the lines or file names that match the given argument (case sensitive) and returns the result |
| `grep -R <ARGUEMENT>` | searches all files in the given directory and outputs filenames and lines that match the given arguement |
| `grep -Rl <ARGUEMENT>` | searches allt files in a directory and ouputs only filenames that match the given arguement |
| `sed '<EXPRESSION>' <FILE_NAME>` | searches the given file for matches in the expression given (Expression Sample: 's/snow/rain/') |

## Environment:
| COMMAND | DESCRIPTION |
| --- | ------------------------------------------------- |
| `nano <FILE_NAME>` | nano is a text editor. To save, hit `CRTL O` and exit `CRTL X` |
| `nano ~/.bash_profile` | creates a filed called bash_profile to store environment settings |
| `source ~/.bash_profile` | runs bash_profile |
| `alias <VARIABLE_NAME>=<COMMAND>` | create your own environment variable |
| `export <VARIALBE_NAME>=<ARGUEMENT>` | makes the variable avaliable to all child sessions from the session you are in (export PS1="<TERMINAL_FORMAT_YOU_WANT>)|
| `env` | returns a list of the environment variables for the current user |
