import json
tips='05'
data={}
data['tips']=[]

line={}
line['type']='text'
line['content']='Each segment must be separated by at least one empty square.'
data['tips'].append(line)
line={}
line['type']='example'
line['content']='examples/05.json'
data['tips'].append(line)

json.dump(data,open('tips/'+ tips +'.json','w'),sort_keys=True)
